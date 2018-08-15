public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread p1 = new Thread(new Producer(storage, "p1"));
        Thread p2 = new Thread(new Producer(storage, "p2"));
        Thread p3 = new Thread(new Producer(storage, "p3"));

        Thread c1 = new Thread(new Consumer(storage, "c1"));
        Thread c2 = new Thread(new Consumer(storage, "c2"));
        Thread c3 = new Thread(new Consumer(storage, "c3"));

        /*notify唤醒一个正在等待的线程，他不知道是哪一个；notify唤醒所有的线程，
        这些线程需要争夺资源，最终只有一个线程能拿到锁并运行*/
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
