package Service;

import java.sql.Time;
import java.util.Date;

;

public class Sale {
    private long sale_id;      		//销售记录ID
    private int user_id;		//售票员ID
    private int ticket_id;		//票ID
    private Date sale_date ;	//处理日期
    private Time sale_time;	//处理时间
    private int sale_value;			//票价
    private sale_type_t sale_type; //交易类型


    public Sale() {}

    public Sale(int user_id,int ticket_id,Date sale_date,Time sale_time,int sale_value,sale_type_t sale_type)
    {
        this.user_id = user_id;
        this.ticket_id = ticket_id;
        this.sale_date = sale_date;
        this.sale_time = sale_time;
        this.sale_value =sale_value;
        this.sale_type =sale_type;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public Date getSale_date() {
        return sale_date;
    }

    public int getSale_value() {
        return sale_value;
    }

    public long getSale_id() {
        return sale_id;
    }

    public sale_type_t getSale_type() {
        return sale_type;
    }

    public Time getSale_time() {
        return sale_time;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }

    public void setSale_time(Time sale_time) {
        this.sale_time = sale_time;
    }

    public void setSale_id(long sale_id) {
        this.sale_id = sale_id;
    }

    public void setSale_value(int sale_value) {
        this.sale_value = sale_value;
    }

    public void setSale_type(sale_type_t sale_type) {
        this.sale_type = sale_type;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public static enum sale_type_t{
        SALE_SELL,	//买票
        SALE_RETURN	//退票
    }
}
