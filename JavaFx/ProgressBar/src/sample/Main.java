package sample;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ProgressBar");
        ProgressBar bar = new ProgressBar();
        Task task = createTask();
        bar.progressProperty().bind(task.progressProperty());
        Group root = new Group();
        root.getChildren().add(bar);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Thread thread =         new Thread(task);
        thread.setDaemon(true);
        thread.start();
        primaryStage.show();
    }


    private Task createTask(){

        return new Task<Void>(){
            @Override protected Void call() throws Exception {
                for(int iterations = 0; iterations < 100; iterations++){
                    if(isCancelled()) break;
                    TimeUnit.SECONDS.sleep(10);
                    updateProgress(iterations,100);
                }
                return null;
            }
        };
    }


    public static void main(String[] args) {
        launch(args);
    }
}
