package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("schedule");

        VBox pane = new VBox();
        for(int i=0;i<5;i++){
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(0, 10, 0, 10));


        VBox time = new VBox();
        time.setPadding(new Insets(5, 20, 5, 20));
        time.setAlignment(Pos.CENTER);
        Label starttime = new Label("10:30");
        starttime.setStyle("-fx-font-size: 20;-fx-font-style: italic");
        Label endtime = new Label("12:10"+"散场");
        time.getChildren().addAll(starttime, endtime);

        VBox type = new VBox();
        type.setAlignment(Pos.CENTER);
        type.setPadding(new Insets(5, 20, 5, 20));
        Label viewtype = new Label("2D");
        Label languagtype = new Label("英文版");
        type.getChildren().addAll(viewtype, languagtype);

        VBox price = new VBox();
        price.setAlignment(Pos.CENTER);
        price.setPadding(new Insets(5, 30, 5, 30));
        Label ticketprice = new Label("30");
        ticketprice.setStyle("-fx-font-size: 24");
        price.getChildren().add(ticketprice);

        VBox choose = new VBox();
        choose.setAlignment(Pos.CENTER);
        choose.setPadding(new Insets(5, 20, 5, 20));
        Button check = new Button("选座");
        choose.getChildren().add(check);

        hBox.getChildren().addAll(time, type, price, choose);

        pane.getChildren().add(hBox);
    }

        primaryStage.setScene(new Scene(pane,800,600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
