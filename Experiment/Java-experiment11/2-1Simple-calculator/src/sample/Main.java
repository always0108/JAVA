package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private TextField number1 = new TextField();
    private TextField number2 = new TextField();
    private TextField result = new TextField();
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(40,40,40,40));
        pane.setHgap(20);
        pane.setVgap(20);

        //创建Label和输入框
        pane.add(new Label("Number1"),0,0);
        pane.add(number1,1,0);
        pane.add(new Label("Number2"),0,1);
        pane.add(number2,1,1);
        pane.add(new Label("result"),0,2);
        pane.add(result,1,2);

        //创建Button
        Button btadd = new Button("+");
        Button btsubtract = new Button("-");
        Button btmultiply = new Button("×");
        Button btdivide = new Button("/");
        pane.add(btadd,1,3);
        pane.add(btsubtract,2,3);
        pane.add(btmultiply,1,4);
        pane.add(btdivide,2,4);

        btadd.setOnAction(e -> Addfunction());
        btsubtract.setOnAction(e -> Subtractfunction());
        btmultiply.setOnAction(e -> Multiplyfunction());
        btdivide.setOnAction(e -> Dividefunction());

        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.show();
    }

    private void Addfunction(){
        //Get value from text field
        try
        {
            double a = Double.parseDouble(number1.getText());
            double b = Double.parseDouble(number2.getText());
            double answer = a + b;
            result.setText(subZeroAndDot(answer+""));
        }catch(Exception e){
            result.setText("输入有错误");
        }
    }

    private void Multiplyfunction(){
        try
        {
            double a = Double.parseDouble(number1.getText());
            double b = Double.parseDouble(number2.getText());
            double answer = a * b;
            result.setText(subZeroAndDot(answer+""));
        }catch(Exception e){
            result.setText("输入有错误");
        }
    }

    private void Subtractfunction(){
        try
        {
            double a = Double.parseDouble(number1.getText());
            double b = Double.parseDouble(number2.getText());
            double answer = a - b;
            result.setText(subZeroAndDot(answer+""));
        }catch(Exception e){
            result.setText("输入有错误");
        }
    }

    private void Dividefunction(){
        //Get value from text field
        try
        {
            double a = Double.parseDouble(number1.getText());
            double b = Double.parseDouble(number2.getText());
            double answer = a / b;
            result.setText(subZeroAndDot(answer+""));
        }catch(Exception e){
            result.setText("输入有错误");
        }
    }

    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
