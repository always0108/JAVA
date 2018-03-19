package org.group1;
import Service.Play;
import Service.Schedule;
import View.*;
import Service.Seat;
import Service.Ticket;
import View.FilmUI;
import View.SeatUI;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;


public class Main extends Application {

    public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

        primaryStage.setTitle("TTMS");

        /*Pane pane = new Pane();
        pane.getChildren().add(new onePlay().init(new Play("水形物语")));

        FilmUI.allSchedulePlayStudio.add(new Schedule(1,1,new Date(),10,30));

        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,1,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,2,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,3,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,4,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,5,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,6,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,7,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,8,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,9,30, 1));
        FilmUI.allSchedulePlayStudioSeatTicket.add(new Ticket(1,10,30, 1));

        LinkedList<Seat> seats = new LinkedList<>();
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(1,1,1,1, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(2,1,1,2, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(3,1,1,3, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(4,1,1,4, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(5,1,1,5, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(6,1,2,1, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(7,1,2,2, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(8,1,2,3, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(9,1,2,4, 1));
        FilmUI.allSchedulePlayStudioSeat.add(new Seat(10,1,2,5, 1));
        */
        BorderPane borderPane = new BorderPane(MainUI.center(),MainUI.top(),null,null,MainUI.functionmenu());
        borderPane.setPadding(new Insets(10,20,10,20));
        primaryStage.setScene(new Scene(borderPane,800,600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

