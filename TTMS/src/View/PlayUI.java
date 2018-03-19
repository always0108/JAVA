package View;

import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class PlayUI {

    public static TitledPane playmenu(){
        TitledPane play = new TitledPane();
        play.setText("剧目管理");
        VBox content = new VBox();
        content.setSpacing(10);
        Button list = new Button("查看剧目");
        Button add = new Button("添加剧目");
        Button delete = new Button("删除剧目");
        Button modify = new Button("编辑剧目");
        content.getChildren().addAll(list,add,delete,modify);
        play.setContent(content);
        return play;
    }
}
