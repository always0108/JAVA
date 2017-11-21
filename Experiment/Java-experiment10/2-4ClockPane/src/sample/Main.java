package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox(10);
        double paneWidth = 400;
        double paneHeight = 300;

        ClockPane clock1 = new ClockPane(4, 20, 45);
        ClockPane clock2 = new ClockPane(22, 46, 15);

        hBox.getChildren().addAll(clock1, clock2);

        Scene scene = new Scene(hBox, paneWidth, paneHeight);
        primaryStage.setTitle("Exercise14_26");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;

    //设置时钟面板的宽度和高度
    private double w = 200, h = 200;

    //构造函数
    public ClockPane() {
        setCurrentTime();
    }

    //设置带参数的构造函数
    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    //返回小时
    public int getHour() {
        return hour;
    }

    //返回分钟
    public int getMinute() {
        return minute;
    }

    //返回秒钟
    public int getSecond() {
        return second;
    }

    //设置一个新的小时
    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    //设置一个新的分钟
    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    //设置一个新的秒钟
    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    //返回时钟面板的宽度
    public double getW() {
        return w;
    }

    //设置一个新的面板宽度
    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    //返回时钟面板的高度
    public double getH() {
        return h;
    }

    //设置时钟面板的高度
    public void setH(double h) {
        this.h = h;
        paintClock();
    }

    public void setCurrentTime() {
        //获取当前时间
        Calendar calendar = new GregorianCalendar();
        //设置当前时间
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        //重画
        paintClock();
    }

    public void paintClock() {

        //初始化时钟参数
        double clockRadius = Math.min(w, h) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;

        //显示当前时间,并设置时间显示的位置
        String timeString = hour + ":" + minute + ":" + second;
        Label labelCurrentTime = new Label(timeString);
        labelCurrentTime.setLayoutX(centerX - 25);
        labelCurrentTime.setLayoutY(centerY + clockRadius + 5);

        //画圆
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setStyle("-fx-stroke: black; -fx-fill: white");
        Text t1 = new Text(centerX - 5, centerY - clockRadius +12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 5, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

        //画秒针
        double sLength = clockRadius * 0.8; //设置秒针的长度
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60.0));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60.0));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);

        //画分针
        double mLength = clockRadius * 0.65; //设置分针的长度
        double minuteX = centerX + mLength * Math.sin(minute * 2 * Math.PI / 60.0);
        double minuteY = centerY - mLength * Math.cos(minute * 2 * Math.PI / 60.0);
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        mLine.setStroke(Color.BLUE);

        //画时针
        double hLength = clockRadius * 0.5; //设置时针的长度
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * 2 * Math.PI / 12);
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * 2 * Math.PI / 12);
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine, labelCurrentTime);
    }
}
