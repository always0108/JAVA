package org.xiyoulinux;

public class MyRunnable implements Runnable {
    private String name;
    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=0;i<20;i++)
            System.out.print(name + i + " ");
    }
}
