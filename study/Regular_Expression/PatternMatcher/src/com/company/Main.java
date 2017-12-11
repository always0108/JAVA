package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	    String[] regexs = {".*foo" , ".*?foo" , ".*+foo"};
	    for(String regex : regexs){
	        Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher("xfooxxxxxxfoo");
            out.printf("%s find ",pattern.pattern());
            while(matcher.find()){
                out.printf("\"%s\"",matcher.group());
            }
            out.println("in \"xfooxxxxxxfoo\".");
        }
    }
}
