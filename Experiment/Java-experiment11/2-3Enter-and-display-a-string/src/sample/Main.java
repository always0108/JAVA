package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    StringBuilder builder = new StringBuilder();
    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane pane = new StackPane();
        Text text = new Text("To be replaced");
        pane.getChildren().add(text);

        pane.setFocusTraversable(true);
        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                text.setText(builder.toString());
                builder.delete(0,builder.length());//清空缓存区
            }
            else {
                builder.append(e.getText());
            }
        });

        primaryStage.setTitle("Enter and display a string");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();

        pane.requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
