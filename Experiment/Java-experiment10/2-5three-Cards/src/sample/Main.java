package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }
        java.util.Collections.shuffle(list);

        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().add(new ImageView("pukeImage/" + list.get(0) + ".jpg"));
        pane.getChildren().add(new ImageView("pukeImage/" + list.get(1) + ".jpg"));
        pane.getChildren().add(new ImageView("pukeImage/" + list.get(2) + ".jpg"));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display three cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
