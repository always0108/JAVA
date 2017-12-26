package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    //并不是因为类型的问题，是思路的问题
    private Integer sum1 = new Integer(0);
    private int sum = 0;

    //同步
    public synchronized void Increase(){
        sum++;
        sum1=new Integer(sum1+1);
    }

    //不同步
    /*public  void Increase(){
        sum++;
        sum1=new Integer(sum1+1);
    }*/

    public void ThreadPool() {
        ExecutorService executor = Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++) {
                executor.execute(new SumTask());
                /*try{
                    Thread.sleep(1);
                }catch(InterruptedException ex){

                }*/
        }
        executor.shutdown();

        //判断是否所有的线程已经运行完,运行完才退出该步骤
        while(!executor.isTerminated()) {
        }
    }

    class SumTask implements Runnable {
        //同步的是自增这个操作，而不是run方法，每个run方法都是独立的，不相互影响
        public void run(){
            Increase();
        }
    }

    public static void main(String[] args) {
            Main test = new Main();
            test.ThreadPool();
            System.out.println("What is sum (int)    ? " + test.sum);
            System.out.println("What is sum1(Integer)? " + test.sum1);
    }
}
