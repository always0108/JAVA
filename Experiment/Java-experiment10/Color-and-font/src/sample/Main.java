package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox pane = new HBox();

        pane.setAlignment(Pos.CENTER);

        Font font = Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 22);

        for(int i = 0; i < 5; i++) {
            Text text = new Text("Java");
            text.setRotate(90);
            text.setFont(font);
            text.setFill(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane, 400,150);
        primaryStage.setTitle("Exercise14_04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}