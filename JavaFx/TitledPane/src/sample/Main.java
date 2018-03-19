package sample;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group g = new Group();
        Scene scene = new Scene(g, 800, 600);

        TitledPane studio = new TitledPane();
        studio.setText("演出厅管理");
        VBox studiocontent = new VBox();
        studiocontent.setSpacing(10);
        Button studiolist = new Button("查看演出厅");
        Button studioadd = new Button("添加演出厅");
        Button studiodel = new Button("删除演出厅");
        Button studioModify = new Button("编辑演出厅");
        studiocontent.getChildren().addAll(studiolist,studioadd,studiodel,studioModify);
        studio.setContent(studiocontent);

        TitledPane play = new TitledPane();
        play.setText("剧目管理");
        VBox playcontent = new VBox();
        playcontent.setSpacing(10);
        Button playlist = new Button("查看演出厅");
        Button playadd = new Button("添加演出厅");
        Button playdel = new Button("删除演出厅");
        Button playModify = new Button("编辑演出厅");
        playcontent.getChildren().addAll(playlist,playadd,playdel,playModify);
        play.setContent(playcontent);

        Accordion accordion = new Accordion();

        accordion.getPanes().addAll(studio,play);

        /*accordion.expandedPaneProperty()
                .addListener((ObservableValue<? extends TitledPane> ov, TitledPane old_val, TitledPane new_val) -> {
                    if (new_val != null) {
                        System.out.println(accordion.getExpandedPane().getText());
                    }
                });*/

        g.getChildren().add(accordion);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
