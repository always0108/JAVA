package org.group1;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("schedule");


        //模拟数据
        LinkedList<Schedule_information> filmlist = new LinkedList<>();
        filmlist.add(new Schedule_information(1,"08:00","09:30","英文","3D",30));
        filmlist.add(new Schedule_information(2,"09:40","11:10","英文","3D",30));
        filmlist.add(new Schedule_information(3,"11:30","13:00","英文","3D",30));
        filmlist.add(new Schedule_information(4,"13:30","15:00","英文","3D",30));
        filmlist.add(new Schedule_information(5,"15:30","17:00","英文","3D",30));
        filmlist.add(new Schedule_information(6,"20:00","21:30","英文","3D",40));

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


        VBox pane = new VBox();
        for(int i=0;i<filmlist.size();i++){
            HBox hBox = new HBox();
            hBox.setPadding(new Insets(0, 10, 0, 10));


            VBox time = new VBox();
            time.setPadding(new Insets(5, 20, 5, 20));
            time.setAlignment(Pos.CENTER);
            Label starttime = new Label(filmlist.get(i).start);
            starttime.setStyle("-fx-font-size: 20;-fx-font-style: italic");
            Label endtime = new Label(filmlist.get(i).end+"散场");
            time.getChildren().addAll(starttime, endtime);

            VBox type = new VBox();
            type.setAlignment(Pos.CENTER);
            type.setPadding(new Insets(5, 20, 5, 20));
            Label viewtype = new Label(filmlist.get(i).type);
            Label languagtype = new Label(filmlist.get(i).language);
            type.getChildren().addAll(viewtype, languagtype);

            VBox price = new VBox();
            price.setAlignment(Pos.CENTER);
            price.setPadding(new Insets(5, 30, 5, 30));
            Label ticketprice = new Label(String.valueOf(filmlist.get(i).price));
            ticketprice.setStyle("-fx-font-size: 24");
            price.getChildren().add(ticketprice);

            VBox choose = new VBox();
            choose.setAlignment(Pos.CENTER);
            choose.setPadding(new Insets(5, 20, 5, 20));
            //Button check = new Button("选座");

            Hyperlink check = new Hyperlink(String.valueOf(filmlist.get(i).schedule_id),new ImageView("choose_seat.png"));
            check.setStyle("-fx-border-style: hidden;-fx-content-display:graphic-only");
            check.setOnAction(e->{
                primaryStage.setScene(SeatUI.init());
            });
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

class Schedule_information{
    int schedule_id;
    String start;
    String end;
    String type;
    String language;
    double price;

    public Schedule_information(){}

    public Schedule_information(int schedule_id,String start, String end, String language, String type, double price)
    {
        this.schedule_id =  schedule_id;
        this.start = start;
        this.end = end;
        this.type = type;
        this.language = language;
        this.price = price;
    }
}