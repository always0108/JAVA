package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Image image = new Image("uk.jpg");

        Hyperlink link = new Hyperlink("uk",new ImageView(image));
        link.setStyle("-fx-border-style: hidden;-fx-content-display:graphic-only");

        link.setOnAction(e->{
            System.out.println(link.getText());
            System.out.println("this link is click!");
        });

        Pane pane = new Pane();
        pane.getChildren().add(link);
        primaryStage.setTitle("radiobutton");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();*/
        Stage stage = new Stage();

        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();


        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setPannable(true);
        scrollPane.setContent(browser);

        webEngine.loadContent("<html>\n" +
                "<head>\n" +
                "  <meta content='text/html;charset=UTF-8' http-equiv='content-type'>\n" +
                "  <title>上古微博</title>\n" +
                "  <style type=\"text/css\">\n" +
                "    span{\n" +
                "      float: left;\n" +
                "      width:80px;\n" +
                "      height: 25px;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<h1>上古微博</h1>\n" +
                "<form method=\"post\" action=\"login.do\">\n" +
                "  <div>\n" +
                "    <span>用户名：</span><input type=\"text\" name=\"username\"  size=\"25\" maxlength=\"16\"> <br>\n" +
                "    <span>密码：</span> <input type=\"password\" name=\"password\" size=\"25\" maxlength=\"16\">  <br> <br>\n" +
                "    \n" +
                "    <input type=\"submit\" value=\"登录\" name=\"login\">\n" +
                "    <a href=\"register.jsp\">注册</a>  <br>\n" +
                "    <br>\n" +
                "  </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();

        /*Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);// =>  w w W .Y I I B  A I .c O  M

        Rectangle rect = new Rectangle(200, 200, Color.RED);
        ScrollPane s1 = new ScrollPane();
        s1.setPannable(true);
        s1.setPrefSize(120, 120);
        s1.setContent(rect);

        root.getChildren().add(s1);
        stage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
