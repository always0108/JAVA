package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private double paneWidth = 500;
    private double paneHeight = 150;

    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField tfDecimal = new TextField();
        TextField tfHex = new TextField();
        TextField tfBinary = new TextField();

        tfDecimal.setAlignment(Pos.BOTTOM_RIGHT);
        tfHex.setAlignment(Pos.BOTTOM_RIGHT);
        tfBinary.setAlignment(Pos.BOTTOM_RIGHT);
        tfHex.setAlignment(Pos.BOTTOM_RIGHT);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.add(new Label("Decimal"), 0, 0);
        pane.add(tfDecimal, 1, 0);
        pane.add(new Label("Hex"), 0, 1);
        pane.add(tfHex, 1, 1);
        pane.add(new Label("Binary"), 0, 2);
        pane.add(tfBinary, 1, 2);


        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle("进制转换");
        primaryStage.setScene(scene);
        primaryStage.show();

        tfDecimal.setOnAction(e -> {
            int decimal = Integer.parseInt(tfDecimal.getText());
            tfHex.setText(Integer.toHexString(decimal));
            tfBinary.setText(Integer.toBinaryString(decimal));
        });

        tfHex.setOnAction(e -> {
            int decimal = Integer.parseInt(tfHex.getText(), 16);
            tfDecimal.setText(decimal + "");
            tfBinary.setText(Integer.toBinaryString(decimal));
        });

        tfBinary.setOnAction(e -> {
            int decimal = Integer.parseInt(tfBinary.getText(), 2);
            tfDecimal.setText(decimal + "");
            tfHex.setText(Integer.toHexString(decimal));
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
