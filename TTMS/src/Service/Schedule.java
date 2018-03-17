package Service;

import java.sql.Time;
import java.util.Date;

public class Schedule {

    private int schedule_id;   //演出计划ID号,primary_key不能设置value
    private int play_id;       //演出的剧目ID号
    private int studio_id;     //演出的放映厅ID号
    private Date date;         //演出日期
    private Time time;         //演出时间
    private int seat_count;    //座位数量
    private double price;      //票价

    public Schedule(){}

    public Schedule(int play_id, int studio_id, Date date,/*Time time,*/int seat_count,double price)
    {
        this.play_id = play_id;
        this.studio_id = studio_id;
        this.date = date;
        //this.time = time;
        this.seat_count = seat_count;
        this.price = price;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public int getPlay_id() {
        return play_id;
    }

    public int getStudio_id() {
        return studio_id;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public double getPrice() {
        return price;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public void setStudio_id(int studio_id) {
        this.studio_id = studio_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
