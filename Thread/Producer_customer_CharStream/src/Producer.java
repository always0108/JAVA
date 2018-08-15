import java.io.IOException;
import java.io.PipedWriter;

public class Producer implements Runnable {

    private PipedWriter pipedWriter;

    public Producer() {
        pipedWriter = new PipedWriter();
    }

    public PipedWriter getPipedWriter() {
        return pipedWriter;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pipedWriter.write("This is a test, Id=" + i + "!\n");
            }
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
