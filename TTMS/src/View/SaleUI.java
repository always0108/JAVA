package View;

import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class SaleUI {


    public static TitledPane salemenu(){
        TitledPane sale = new TitledPane();
        sale.setText("票务管理");
        VBox content = new VBox();
        content.setSpacing(10);
        Button sell = new Button("售票");
        Button refund = new Button("退票");
        content.getChildren().addAll(sell,refund);
        sale.setContent(content);
        return sale;
    }
}
