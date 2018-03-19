package sample;

public class Studio {
    int studio_id;			//放映厅ID
    String studio_name;	    //放映厅名称
    int studio_rowsCount;	//座位行数
    int studio_colsCount;	//座位列数
    int studio_seatsCount;  //座位总数

    public Studio(){}

    public Studio(String studio_name,int studio_rowsCount,int studio_colsCount){
        this.studio_name = studio_name;
        this.studio_rowsCount = studio_rowsCount;
        this.studio_colsCount = studio_colsCount;
        this.studio_seatsCount = studio_colsCount*studio_rowsCount;
    }

    public int getStudio_id() {
        return studio_id;
    }

    public int getStudio_colsCount() {
        return studio_colsCount;
    }

    public int getStudio_rowsCount() {
        return studio_rowsCount;
    }

    public int getStudio_seatsCount() {
        return studio_seatsCount;
    }

    public String getStudio_name() {
        return studio_name;
    }

    public void setStudio_colsCount(int studio_colsCount) {
        this.studio_colsCount = studio_colsCount;
    }

    public void setStudio_rowsCount(int studio_rowsCount) {
        this.studio_rowsCount = studio_rowsCount;
    }

    public void setStudio_seatsCount(int studio_seatsCount) {
        this.studio_seatsCount = studio_seatsCount;
    }

    public void setStudio_name(String studio_name) {
        this.studio_name = studio_name;
    }
}
