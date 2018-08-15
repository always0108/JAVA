import java.io.IOException;
import java.io.PipedOutputStream;

public class Producer implements Runnable {

    private PipedOutputStream pipedOutputStream;

    public Producer() {
        pipedOutputStream = new PipedOutputStream();
    }

    public PipedOutputStream getPipedOutputStream() {
        return pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pipedOutputStream.write(("This is a test, Id=" + i + "!\n").getBytes());
            }
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
