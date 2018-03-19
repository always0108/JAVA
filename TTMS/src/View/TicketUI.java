package View;

import Service.Ticket;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.List;

public class TicketUI {


    public Scene init(List<Ticket> ticketlist){
        Pane pane = new Pane();

        return new Scene(pane,800,600);
    }
}
