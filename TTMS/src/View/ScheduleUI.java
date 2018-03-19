package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.group1.Main;
import java.util.LinkedList;

public class ScheduleUI {

    public static TitledPane playmenu(){
        TitledPane schedule = new TitledPane();
        schedule.setText("演出计划管理");
        VBox content = new VBox();
        content.setSpacing(10);
        Button list = new Button("查看演出计划");
        Button add = new Button("添加演出计划");
        Button delete = new Button("删除演出计划");
        Button modify = new Button("编辑演出计划");
        content.getChildren().addAll(list,add,delete,modify);
        schedule.setContent(content);
        return schedule;
    }

    public VBox init() {
        //模拟数据
        LinkedList<Schedule_information> filmlist = new LinkedList<>();
        filmlist.add(new Schedule_information(1,"08:00","09:30","英文","3D",30));
        filmlist.add(new Schedule_information(2,"09:40","11:10","英文","3D",30));
        filmlist.add(new Schedule_information(3,"11:30","13:00","英文","3D",30));
        filmlist.add(new Schedule_information(4,"13:30","15:00","英文","3D",30));
        filmlist.add(new Schedule_information(5,"15:30","17:00","英文","3D",30));
        filmlist.add(new Schedule_information(6,"20:00","21:30","英文","3D",40));

        VBox pane = new VBox();
        for(int i=0;i<filmlist.size();i++){
            HBox hBox = new HBox();
            hBox.setPadding(new Insets(0, 10, 0, 10));


            VBox time = new VBox();
            time.setPadding(new Insets(5, 20, 5, 20));
            time.setAlignment(Pos.CENTER);
            Label starttime = new Label(filmlist.get(i).start);
            starttime.setStyle("-fx-font-size: 20;-fx-font-style: italic");
            Label endtime = new Label(filmlist.get(i).end+"散场");
            time.getChildren().addAll(starttime, endtime);

            VBox type = new VBox();
            type.setAlignment(Pos.CENTER);
            type.setPadding(new Insets(5, 20, 5, 20));
            Label viewtype = new Label(filmlist.get(i).type);
            Label languagtype = new Label(filmlist.get(i).language);
            type.getChildren().addAll(viewtype, languagtype);

            VBox price = new VBox();
            price.setAlignment(Pos.CENTER);
            price.setPadding(new Insets(5, 30, 5, 30));
            Label ticketprice = new Label(String.valueOf(filmlist.get(i).price));
            ticketprice.setStyle("-fx-font-size: 24");
            price.getChildren().add(ticketprice);

            VBox choose = new VBox();
            choose.setAlignment(Pos.CENTER);
            choose.setPadding(new Insets(5, 20, 5, 20));
            //Button check = new Button("选座");

            Hyperlink check = new Hyperlink(String.valueOf(filmlist.get(i).schedule_id),new javafx.scene.image.ImageView("choose_seat.png"));
            check.setStyle("-fx-border-style: hidden;-fx-content-display:graphic-only");
            check.setOnAction(e->{
                Main.stage.setScene(SeatUI.init());
            });
            choose.getChildren().add(check);
            hBox.getChildren().addAll(time, type, price, choose);
            pane.getChildren().add(hBox);
        }
        return pane;
    }
}

class Schedule_information{
    int schedule_id;
    String start;
    String end;
    String type;
    String language;
    double price;

    public Schedule_information(){}

    public Schedule_information(int schedule_id,String start, String end, String language, String type, double price)
    {
        this.schedule_id =  schedule_id;
        this.start = start;
        this.end = end;
        this.type = type;
        this.language = language;
        this.price = price;
    }
}
