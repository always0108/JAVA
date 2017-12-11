package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import static java.lang.System.out;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            out.print("输入规则表示式: ");
            String regex = input.nextLine();
            out.print("输入要比较的文字: ");
            String text = input.nextLine();
            print(match(regex,text));
        }catch (PatternSyntaxException ex){
            out.println("规则表示式有误");
            out.println(ex.getMessage());
        }
    }


    private static List<String> match(String regex,String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> matched = new ArrayList<>();
        while(matcher.find()){
            matched.add(String.format("从索引 %d 开始到索引 %d 之间找到符合文字" +
                    " \"%s\"",matcher.start(),matcher.end(),matcher.group()));
        }
        return matched;
    }

    private static void print(List<String> matched){
        if(matched.isEmpty()){
            out.println("找不到符合文字");
        }
        else{
            matched.forEach(out::println);
        }
    }
}
