package View;

import Service.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class SeatUI {

    public static int studio_row_count;
    public static int studio_col_count;
    public static String studio_introduction;
    public static Schedule schedule;
    public static String str;
    public static float totalprice;

    public static List<Ticket> ticketlist = new ArrayList<>();

    public static Scene init(){

        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(false);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        /*for (int i = 1; i <= 2; i++) {
            Label label = new Label(String.valueOf(i));
            label.setPrefWidth(50);
            label.setAlignment(Pos.CENTER);
            gridPane.add(label,0,i);
        }
        for (int i = 1; i <= 5; i++) {
            Label label = new Label(String.valueOf(i));
            label.setPrefWidth(50);
            label.setAlignment(Pos.CENTER);
            gridPane.add(label,i,0);
        }*/
        for (int i = 0; i < FilmUI.allSchedulePlayStudioSeat.size(); i++) {
                Seat seat = FilmUI.allSchedulePlayStudioSeat.get(i);
                Button but = new oneSeatUI(i,seat).init(seat);
                gridPane.add(but,seat.getSeat_column()-1,seat.getSeat_row()-1);
        }

        Button buy = new Button("购买");
        buy.setOnAction(e->{

            ticketlist.clear();
            str = "恭喜您,购票成功,您的座位信息为:\n";

            //测试
            schedule = FilmUI.allSchedulePlayStudio.get(0);

            for (int i = 0; i < FilmUI.allSchedulePlayStudioSeat.size(); i++) {
                if(FilmUI.allSchedulePlayStudioSeat.get(i).getStatus() == 3) {
                    str += FilmUI.allSchedulePlayStudioSeat.get(i).getSeat_row()+ " 排 "+
                            FilmUI.allSchedulePlayStudioSeat.get(i).getSeat_column()+ " 列 \n";
                    Ticket ticket = new Ticket();
                    ticket.setSeat_id(FilmUI.allSchedulePlayStudioSeat.get(i).getSeat_id());
                    ticket.setSchedule_id(schedule.getSchedule_id());
                    ticket.setTicket_price((float)schedule.getPrice());
                    ticket.setStatus(2);
                    //System.out.println(ticket);
                    ticketlist.add(ticket);
                }
            }
            totalprice = 0;
            for (int i = 0; i < ticketlist.size(); i++) {
                totalprice += ticketlist.get(i).getTicket_price();
            }
            if(ticketlist.size() != 0) {
                str += "祝您观影愉快!共消费"+String.valueOf(totalprice)+"元!";
                System.out.println(str);
            }else{
                String note ="未选中任何座位!!!";
                System.out.println(note);
            }
        });
        Button back = new Button("返回");
        gridPane.add(buy,2,4);
        gridPane.add(back,4,4);
        return new Scene(gridPane,800,600);
    }


}
