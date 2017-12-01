package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

    private double paneWidth = 400;
    private double paneHeight = 300;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BorderPane p = new BorderPane();
        p.setLeft(new Label("Filename"));
        TextField tfFilename = new TextField();
        p.setCenter(tfFilename);
        Button btView = new Button("View");
        p.setRight(btView);

        BorderPane pane = new BorderPane();
        TextArea ta = new TextArea();
        pane.setCenter(new ScrollPane(ta));
        pane.setBottom(p);
        p.setStyle("-fx-border-color: black");

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, paneWidth, paneHeight);
        primaryStage.setTitle("Text viewer"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        btView.setOnAction(e -> {
            // Get file name from the text field
            String filename = tfFilename.getText().trim();

            try {
                // Create a buffered stream
                Scanner input = new Scanner(new File(filename));

                // Read a line and append the line to the text area
                while (input.hasNext()) {
                    ta.appendText(input.nextLine() + '\n');
                }
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found: " + filename);
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
