package sample;

import com.sun.corba.se.impl.orb.ParserTable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("西邮导航");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @FXML
    private Button Test;

    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField passwordarea;

    @FXML
    private TextField usernamefield;

    @FXML
    public void Hello(ActionEvent event) {
        Test.setText("ok");
    }

    @FXML
    public void logintest(ActionEvent event) {
        String name = usernamefield.getText();
        String password = passwordarea.getText();
        System.out.println(name+"------"+password);
    }



    public static void main(String[] args) {
        launch(args);
    }
}

  /*  Scene scene1;
    Scene scene2;

    @Override
    public void start(Stage primaryStage) {
        /*Button button1=new Button("Go to the second scene");
        Label label1=new Label("I am the first scene");
        VBox layout1=new VBox();
        layout1.getChildren().addAll(label1,button1);
        scene1=new Scene(layout1,400,300);

        Button button2=new Button("Go to the first scene");
        Label label2=new Label("I am the second scene");
        VBox layout2=new VBox();
        layout2.getChildren().addAll(label2,button2);
        scene2=new Scene(layout2,500,400);

        button1.setOnAction(e->{
            primaryStage.setScene(scene2);
        });
        button2.setOnAction(e->{
            primaryStage.setScene(scene1);
        });

        //需要初始化一个stage上的scene
        //Button button1=new Button("Display new stage");
        Button button1=new Button("close");
        StackPane layout1=new StackPane();
        PasswordField password = new PasswordField();
        layout1.getChildren().add(password);
        //layout1.getChildren().add(button1);
        scene1=new Scene(layout1,400,300);


        button1.setOnAction(event -> {
            primaryStage.close();
            //newStage();
        });

        primaryStage.setScene(scene1);
        primaryStage.setTitle("第一舞台");
        primaryStage.show();
    }

    public void newStage(){
        Stage secondaryStage=new Stage();

        DropShadow shadow = new DropShadow();

        Button button1=new Button("去这里");
        button1.setEffect(shadow);
        Button button2=new Button("exit");
        Button button3=new Button("简介");
        GridPane layout2=new GridPane();
        layout2.add(button1,0,2);
        layout2.add(button2,1,2);
        layout2.add(button3,2,2);


        button2.setOnAction(event -> {
            secondaryStage.close();
        });
        Scene secondaryScene=new Scene(layout2,200,100);
        secondaryStage.setScene(secondaryScene);
        secondaryStage.setTitle("第二舞台");
        secondaryStage.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

*/