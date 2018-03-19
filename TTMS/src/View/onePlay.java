package View;

import Service.Play;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.group1.Main;

public class onePlay {
    private int play_id;
    private String play_name;

    public onePlay(){}

    public onePlay(int play_id,String play_name){
        this.play_id = play_id;
        this.play_name = play_name;
    }

    public VBox init(Play play){
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(5,5,5,5));
        Hyperlink link = new Hyperlink(play.getPlay_name(),new ImageView("test.png"));
        link.setStyle("-fx-border-style: hidden;-fx-content-display: graphic-only");
        link.setOnAction(e->{
            Main.stage.setScene(new Scene(new ScheduleUI().init(),800,600));
        });
        Label name = new Label(play.getPlay_name());
        name.setStyle("-fx-font-size: 16");
        vBox.getChildren().addAll(link,name);
        return vBox;
    }

}
