package Service;

import java.util.Date;


public class Play {
    private int play_id;                    //剧目ID号
    private String play_name;               //剧目名称
    private play_type_t type;               //剧目类型
    private String play_area;               //剧目来源地区
    private play_rating_t rating;           //剧目级别
    private int duration;                   //以分钟为单位      //演出时长
    private Date start_date;                //上映日期
    private Date end_date;                  //结束日期
    private int price;                      //票的价格



    public Play(String play_name,play_type_t type,String play_area,play_rating_t rating,int duration,Date start_date,Date end_date,int price)
    {
        this.play_name = play_name;
        this.type = type;
        this.play_area = play_area;
        this.rating = rating;
        this.duration = duration;
        this.end_date = end_date;
        this.start_date = start_date;
        this.price = price;
    }

    public int getPlay_id() {
        return play_id;
    }

    public String getPlay_name() {
        return play_name;
    }

    public int getDuration() {
        return duration;
    }

    public play_type_t getType() {
        return type;
    }

    public play_rating_t getRating() {
        return rating;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public String getPlay_area() {
        return play_area;
    }

    public int getPrice() {
        return price;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name;
    }

    public void setPlay_area(String play_area) {
        this.play_area = play_area;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(play_rating_t rating) {
        this.rating = rating;
    }

    public void setType(play_type_t type) {
        this.type = type;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static enum play_rating_t{
        PLAY_RATE_CHILD,
        PLAY_RATE_TEENAGE ,
        PLAY_RATE_ADULT
    }//演出级别类型定义，1表示儿童可观看，2表示青少年可观看，3表示成人可观看

    static enum play_type_t{
        PLAY_TYPE_FILE,
        PLAY_TYPE_OPEAR,
        PLAY_TYPE_CONCERT
    }//剧目类型定义，1表示电影，2表示歌剧，3表示音乐会
}
