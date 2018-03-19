package View;


import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class StudioUI {


    public static TitledPane studiomenu(){
        TitledPane studio = new TitledPane();
        studio.setText("演出厅管理");
        VBox content = new VBox();
        content.setSpacing(10);
        Button list = new Button("查看演出厅");
        Button add = new Button("添加演出厅");
        Button delete = new Button("删除演出厅");
        Button modify = new Button("编辑演出厅");
        content.getChildren().addAll(list,add,delete,modify);
        studio.setContent(content);
        return studio;
    }


}
