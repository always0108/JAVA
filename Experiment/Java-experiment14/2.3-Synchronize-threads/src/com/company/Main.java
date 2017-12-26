package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private Integer sum1 = new Integer(0);
    private int sum = 0;

    public void ThreadPool() {
        ExecutorService executor = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++) {
                executor.execute(new SumTask());
                try{
                    Thread.sleep(1);
                }catch(InterruptedException ex){

                }
        }
        executor.shutdown();

        //判断是否所有的线程已经运行完,运行完才退出该步骤
        while(!executor.isTerminated()) {
        }
    }

    class SumTask implements Runnable {
        //同步
        /*public synchronized void run() {
            sum++;
            sum1=new Integer(sum1+1);
        }*/

        //不同步
        public void run(){
            sum++;
            sum1=new Integer(sum1+1);
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            Main test = new Main();
            test.ThreadPool();
            System.out.println("What is sum  ? " + test.sum);
            System.out.println("What is sum1 ? " + test.sum1);
        }
    }
}
