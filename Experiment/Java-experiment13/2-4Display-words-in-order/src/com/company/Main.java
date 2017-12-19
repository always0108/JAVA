package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Exercise20_01 fullfilename");
            System.exit(1);
        }

        String filename = args[0];

        ArrayList<String> list = new ArrayList<String>();

        try {
            Scanner in = new Scanner(new File(filename));
            String line;

            while (in.hasNext()) {
                line = in.nextLine();
                String[] words = line.split("[ \n\t\r.,:?)({}\\[\\]]");

                for (String word: words) {
                    //trim()用来去掉空格
                    if (word.trim().length() > 0 && word.trim().matches("\\w+"))
                        list.add(word.trim());
                }
            }
        }
        catch (Exception ex) {
            System.err.println(ex);
        }

        //排序
        Collections.sort(list);

        System.out.println("\nDisplay words in ascending order ：");
        for (String word: list) {
            System.out.println(word);
        }
    }
}
