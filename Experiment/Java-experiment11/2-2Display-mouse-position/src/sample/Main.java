package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Text text = new Text();
        pane.getChildren().add(text);


        //按压
        pane.setOnMousePressed(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText("(" + e.getX() + ", " + e.getY() + ")");
        });

        pane.setOnMouseReleased(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText("");
        });

        /*
        //单击
        pane.setOnMouseClicked(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText("(" + e.getX() + ", " + e.getY() + ")");
        });*/

        primaryStage.setTitle("Display the mouse position");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
