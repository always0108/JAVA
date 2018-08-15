import java.io.IOException;
import java.io.PipedReader;

public class Consumer implements Runnable {
    private PipedReader pipedReader;

    public Consumer() {
        pipedReader = new PipedReader();
    }

    public PipedReader getPipedReader() {
        return pipedReader;
    }

    @Override
    public void run() {
        int len = -1;
        char[] buffer = new char[1024];
        try {
            while ((len = pipedReader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
            pipedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
