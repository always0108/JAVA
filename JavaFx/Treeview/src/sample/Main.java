package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Tree View Sample");

        StackPane root = new StackPane();
        TreeItem<String> rootItem = new TreeItem<>("Inbox");
            rootItem.setExpanded(true);
            for (int i = 1; i < 6; i++) {
                TreeItem<String> item = new TreeItem<>("Message" + i);
                rootItem.getChildren().add(item);
            }
            TreeView<String> tree = new TreeView<>(rootItem);

        ChangeListener<TreeItem<String>> change = new ChangeListener<TreeItem<String>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<String>> observable,
                                TreeItem<String> oldValue, TreeItem<String> newValue){
                System.out.println(newValue.getValue());
            }
        };
        tree.getSelectionModel().selectedItemProperty().addListener(change);

            root.getChildren().add(tree);
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();


        /*primaryStage.setTitle("Tree View Sample");

        TreeItem<String> rootItem =
                new CheckBoxTreeItem<>("View Source Files");
        rootItem.setExpanded(true);

        final TreeView tree = new TreeView(rootItem);
        tree.setEditable(true);

        tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
        for (int i = 0; i < 8; i++) {
            final CheckBoxTreeItem<String> checkBoxTreeItem =
                    new CheckBoxTreeItem<>("Sample" + (i+1));
            rootItem.getChildren().add(checkBoxTreeItem);
        }

        tree.setRoot(rootItem);
        tree.setShowRoot(true);

        StackPane root = new StackPane();
        root.getChildren().add(tree);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
