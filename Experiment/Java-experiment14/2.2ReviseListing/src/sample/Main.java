package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Main extends Application {

    private TextArea ta = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        ta.setWrapText(true);

        Thread printA = new Thread(new PrintChar('a', 100));
        Thread printB = new Thread(new PrintChar('b', 100));
        Thread print100 = new Thread(new PrintNum(100));

        print100.start();
        printA.start();
        printB.start();

        Scene scene = new Scene(ta, 400, 300);
        primaryStage.setTitle("Concurrent Output");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class PrintChar implements Runnable {
        private char charToPrint;
        private int	times;

        //有可能出现IndexOutOfBoundsException，抛出
        public PrintChar(char c, int t) throws IndexOutOfBoundsException{
            charToPrint = c;
            times = t;
        }

        public void run() throws IndexOutOfBoundsException{
            for (int i=1; i < times; i++)
                ta.appendText(charToPrint+"");
        }
    }

    class PrintNum implements Runnable {
        private int lastNum;

        //有可能出现IndexOutOfBoundsException，抛出
        public PrintNum(int i) throws IndexOutOfBoundsException{
            lastNum = i;
        }

        public void run() throws IndexOutOfBoundsException{
            for (int i=1; i <= lastNum; i++)
                ta.appendText(" "+i);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
