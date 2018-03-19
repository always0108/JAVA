package View;

import Service.Play;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class MainUI {

    public static Accordion functionmenu(){
        Accordion functionmenu = new Accordion();
        functionmenu.getPanes().addAll(UserUI.usermenu(),StudioUI.studiomenu(),
                PlayUI.playmenu(),ScheduleUI.playmenu(),SaleUI.salemenu());
        functionmenu.setPadding(new Insets(10,10,10,10));
        return  functionmenu;
    }

    public static HBox top(){
        HBox toppane = new HBox();
        toppane.setAlignment(Pos.CENTER_RIGHT);
        toppane.setSpacing(20);
        toppane.setPadding(new Insets(10,10,10,10));
        Label username = new Label("user");
        Button logout = new Button("注销");
        toppane.getChildren().addAll(username,logout);
        return  toppane;
    }

    public static Pane center(){
        Pane pane = new Pane();
        pane.setPadding(new Insets(10,10,10,10));
        TextArea textArea = new TextArea();
        pane.getChildren().addAll(textArea);
        return  pane;
    }
}
