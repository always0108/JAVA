

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread p1 = new Thread(new Producer(storage,3,"p1"));
        Thread p2 = new Thread(new Producer(storage,2,"p2"));
        Thread p3 = new Thread(new Producer(storage,2,"p3"));

        Thread c1 = new Thread(new Consumer(storage,5,"c1"));
        Thread c2 = new Thread(new Consumer(storage,5,"c2"));
        Thread c3 = new Thread(new Consumer(storage,10,"c3"));

        p1.start();
        p2.start();
        p3.start();

        c1.start();
        c2.start();
        c3.start();

    }
}
