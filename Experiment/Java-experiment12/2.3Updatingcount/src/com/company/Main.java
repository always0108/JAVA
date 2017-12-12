package com.company;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
        try (
                RandomAccessFile raf = new RandomAccessFile("Exercise17_08.dat", "rw");
        ) {
            int count = 0;
            if (raf.length() > 0)
                count = raf.readInt();//读取已经打开的次数
            raf.seek(0);
            raf.writeInt(++count);//加一并写入
            System.out.println("Current count is " + count);
        }catch (FileNotFoundException ex){
            System.out.println("File not find");
        }
        catch (java.io.IOException ex){
            System.out.println("close");
        }
    }
}
