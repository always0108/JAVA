package org.xiyoulinux;

public class Main {

    public static void main(String[] args) {
        MyRunnable[] myRunnables = new MyRunnable[3];
        myRunnables[0] = new MyRunnable("A");
        myRunnables[1] = new MyRunnable("B");
        myRunnables[2] = new MyRunnable("C");
//        new Thread(myRunnables[0]).start();
//        new Thread(myRunnables[1]).start();
//        new Thread(myRunnables[2]).start();

        new Thread(myRunnables[0]).run();
        new Thread(myRunnables[1]).run();
        new Thread(myRunnables[2]).run();
    }
}
