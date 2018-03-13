package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        primaryStage.setTitle("Hello World");

        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(false);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        for (int i = 0; i < 6; i++) {
            Label label = new Label(String.valueOf(i+1));
            label.setPrefWidth(50);
            label.setAlignment(Pos.CENTER);
            gridPane.add(label,0,i+1);
        }
        for (int i = 0; i < 6; i++) {
            Label label = new Label(String.valueOf(i+1));
            label.setPrefWidth(50);
            label.setAlignment(Pos.CENTER);
            gridPane.add(label,i+1,0);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int num = 6 * i + j + 1;
                Seat seat = new Seat();
                seat.setSeatStatus(1);
                if (num==15||num==16)
                    seat.setSeatStatus(2);
                Button but = new oneSeatUI(num,seat).init(seat);
                gridPane.add(but,j+1,i+1);
            }
        }
        primaryStage.setScene(new Scene(gridPane, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



