package sample;

import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.*;
import javafx.util.Callback;

public class  Main extends Application {

    public static void main(String[] args) { launch(args); }

    @Override public void start(final Stage stage) {

        Pane pane = new Pane();
        TableView<Person> tableView = new TableView<>();

        TableColumn<Person,String> name = new TableColumn<Person,String>("Name");
        TableColumn<Person,String> sex = new TableColumn<Person,String>("Sex");
        //TableColumn<Person,Button> button = new TableColumn<Person,Button>("function");



        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Person, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> p) {
                return p.getValue().NameProperty();
            }
        });


        sex.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Person, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Person, String> p) {
                return p.getValue().SexProperty();
            }
        });

        /*button.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Person, Button>, ObservableValue<Button>>() {
            public ObservableValue<Button> call(TableColumn.CellDataFeatures<Person, Button> p) {
                return p.getValue().getTableButton().getButton();
            }
        });*/

        TableColumn<Person,String> delCol = new TableColumn<Person,String>("del");

        delCol.setCellFactory((col) -> {
            TableCell<Person, String> cell = new TableCell<Person, String>() {
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    this.setText(null);
                    this.setGraphic(null);

                    if (!empty) {
                        Button delBtn = new Button("删除");
                        this.setGraphic(delBtn);
                        delBtn.setOnMouseClicked((me) -> {
                            Person clickedStu = this.getTableView().getItems().get(this.getIndex());
                            System.out.println("删除 " + clickedStu.getName()  + " 的记录");
                        });
                    }
                }
            };
            return cell;
        });

        tableView.getColumns().setAll(name,sex,delCol);
        ObservableList<Person> members = FXCollections.observableArrayList();

        members.add(new Person("张三","男"));
        members.add(new Person("李军","男"));
        members.add(new Person("王五","男"));
        members.add(new Person("张伟","男"));
        members.add(new Person("泰罗","男"));

        tableView.setItems(members);

        pane.getChildren().add(tableView);
        stage.setScene(new Scene(pane,600,400));
        stage.show();
    }
}

class Person{
    private StringProperty name;
    private StringProperty sex;
    private TableButton tableButton;

    public Person(String name,String sex){
        this.name = new SimpleStringProperty(name);
        this.sex = new SimpleStringProperty(sex);
        this.tableButton = new TableButton("check");
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setSex(String sex) {
        this.sex.set(sex);
    }

    public String getName() {
        return name.get();
    }

    public String getSex() {
        return sex.get();
    }

    public StringProperty NameProperty() {
        return name;
    }
    public StringProperty SexProperty() {
        return sex;
    }

    public TableButton getTableButton() {
       return tableButton;
    }
}

class TableButton
{
    Button button;

    public TableButton(String log){
        this.button = new Button(log);
    }

    public ObservableValue<Button> getButton(){
        return new ObservableValue<Button>() {
            @Override
            public void addListener(ChangeListener<? super Button> listener) {

            }

            @Override
            public void removeListener(ChangeListener<? super Button> listener) {

            }

            @Override
            public Button getValue() {
                return button;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };

    }

}




