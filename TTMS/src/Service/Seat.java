package Service;

;

public class Seat {
    private int seat_id;			//座位id
    private int studio_id;		    //所在演出厅id
    private int seat_row;           		//座位行号
    private int seat_column;        	    //座位列号
    private int status;	//座位在该行的状态，0表示没有座位，1表示有座位。扩展2可表示座位坏了

    public Seat()  {}

    public Seat(int seat_id,int studio_id,int seat_row,int seat_column,int status)
    {
        this.seat_id = seat_id;
        this.studio_id = studio_id;
        this.seat_row = seat_row;
        this.seat_column = seat_column;
        this.status = status;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public int getStudio_id() {
        return studio_id;
    }

    public int getSeat_column() {
        return seat_column;
    }

    public int getSeat_row() {
        return seat_row;
    }

    public int getStatus() {
        return status;
    }

    public void setStudio_id(int studio_id) {
        this.studio_id = studio_id;
    }

    public void setSeat_row(int seat_row) {
        this.seat_row = seat_row;
    }

    public void setSeat_column(int seat_column) {
        this.seat_column = seat_column;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /*public static enum seat_status_t{
        SEAT_NONE,	    //空位
        SEAT_GOOD,	    //有座位
        SEAT_BROKEN     //损坏的座位
    }*/
}
