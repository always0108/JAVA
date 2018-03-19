package View;

import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class UserUI {

    public static TitledPane usermenu(){
        TitledPane user = new TitledPane();
        user.setText("用户管理");
        VBox content = new VBox();
        content.setSpacing(10);
        Button list = new Button("查看用户");
        Button add = new Button("添加用户");
        Button delete = new Button("删除用户");
        Button modify = new Button("编辑用户");
        content.getChildren().addAll(list,add,delete,modify);
        user.setContent(content);
        return user;
    }
}
