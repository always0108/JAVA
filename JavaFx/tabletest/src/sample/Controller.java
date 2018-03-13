package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

        @FXML
        private void initialize(){
            ObservableList<person> data = FXCollections.observableArrayList(
                    new person("1"),
                    new person("2"),
                    new person("3")
            );
            name.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().name) );
            checklist.setCellValueFactory(cellData ->cellData.getValue().cb.getCheckBox());
            table.setItems(data);
        }

    @FXML
    private TableView<person> table;
    @FXML
    private TableColumn<person,String> name;
    @FXML
    private TableColumn<person,CheckBox> checklist;

    @FXML
    public void check()
    {
        ObservableList<person> list=table.getItems();
        for(person o:list)
        {
            if(o.cb.isSelected())
            {
                System.out.println(o.name);
            }
        }
    }
}
