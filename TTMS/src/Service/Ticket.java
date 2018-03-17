package Service;

;

public class Ticket {
    private int ticket_id;
    private int schedule_id;
    private int seat_id;
    private double ticket_price;
    private int status;

    public Ticket() {}

    public Ticket(int schedule_id,int seat_id,double ticket_price,int status)
    {
        this.schedule_id = schedule_id;
        this.seat_id = seat_id;
        this.ticket_price =ticket_price;
        this.status = status;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public double getTicket_price() {
        return ticket_price;
    }

    public int getStatus() {
        return status;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }

    /*public static enum ticket_status_t{
        TICKET_AVL,		//待售
        TICKET_SOLD,	//已售
        TICKET_RESV		//预留
    }*/
}
