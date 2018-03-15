package sample;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Pane pane = new Pane();
        Button button = new Button("test");



        //button.maxHeightProperty().bind(pane.heightProperty().divide(10));
        //button.maxWidthProperty().bind(pane.widthProperty().divide(10));
        //pane.getChildren().add(button);

        /*primaryStage.setTitle("Hello World");
        Scene scene1 = new Scene(pane, 800, 600);
        primaryStage.setScene(scene1);
        primaryStage.show();*/

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        primaryStage.setX(primaryScreenBounds.getMinX());
        primaryStage.setY(primaryScreenBounds.getMinY());
        primaryStage.setWidth(primaryScreenBounds.getWidth());
        primaryStage.setHeight(primaryScreenBounds.getHeight());

        primaryStage.setScene(new Scene(pane, 800, 600));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
