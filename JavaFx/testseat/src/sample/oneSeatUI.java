package sample;

import javafx.scene.control.Button;


public class oneSeatUI{

    private  int row;
    private  int col;
    private  int status;
    private  int seat_id;
    private  int num;

    Button seatbutton = new Button();

    public oneSeatUI() {}

    public oneSeatUI(int i,Seat seat) {
        this.num = i;
        this.row = seat.getRow();
        this.col = seat.getColumn();
        this.status = seat.getSeatStatus();
        this.seat_id = seat.getId();
    }

    public Button init(Seat seat) {
        seatbutton.setPrefWidth(50);
        seatbutton.setPrefHeight(50);
        if (seat.getSeatStatus() == 1) {          //正常可选
            seatbutton.setStyle("-fx-background-color: white");
        } else if (seat.getSeatStatus() == -1 || seat.getSeatStatus() == 0) {   //坏了
            seatbutton.setStyle("-fx-background-color: orange");
        } else if (seat.getSeatStatus() == 2) {   //已经被买
            seatbutton.setStyle("-fx-background-color: red");
        }
        seatbutton.setOnAction(e -> {
            if (getStatus() == 1) {
                seatbutton.setStyle("-fx-background-color: greenyellow");
                setStatus(3);                      //表示选中
            } else if (getStatus() == 3) {
                seatbutton.setStyle("-fx-background-color: white");
                setStatus(1);
            }
        });
        return seatbutton;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getStatus() {
        return status;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
