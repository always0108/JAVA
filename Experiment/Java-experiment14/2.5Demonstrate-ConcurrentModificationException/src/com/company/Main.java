package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    private HashSet hashSet = new HashSet();

    Main() {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        thread1.start();
        thread2.start();
    }

    class Task1 implements Runnable {
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Thread 1");
                hashSet.add(new Integer(i));

                try { Thread.sleep(1000); } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    class Task2 implements Runnable {
        public void run() {
            while (true) {
                System.out.println("Thread 2");

                try { Thread.sleep(1000); } catch (Exception ex) {
                    ex.printStackTrace();
                }

                Iterator iterator = hashSet.iterator();

                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}

