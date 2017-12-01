package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private double paneWidth = 480;
    private double paneHeight = 250;
    private Label label = new Label("No items selected");
    private ComboBox<String> cboSelectionMode = new ComboBox<>();
    private ListView<String> lv = new ListView();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        lv.getItems().addAll("China", "Japan", "Korea", "India",
                "Malaysia", "Vitnam");

        cboSelectionMode.getItems().addAll("SINGLE", "MULTIPLE");
        cboSelectionMode.setValue("SINGLE");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Choose Selection Mode:"),
                cboSelectionMode);
        hBox.setAlignment(Pos.CENTER);
        pane.setTop(hBox);
        pane.setCenter(new ScrollPane(lv));
        pane.setBottom(label);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle("ComboBox and ListView"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        cboSelectionMode.setOnAction(e -> {
            if (cboSelectionMode.getValue().equals("SINGLEP")) {
                lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            }
            else {
                lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            }
        });

        lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
            String items = "";
            for (String s: lv.getSelectionModel().getSelectedItems()) {
                items += s + " ";
            }
            label.setText("Selected items are " + items);
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
