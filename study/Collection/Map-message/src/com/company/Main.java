package com.company;

import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	    //不按顺序
    	Map<String,String> messages = new HashMap<>();
		//按默认顺序（升序）
		//Map<String,String> messages = new TreeMap<>();
		//降序
		//Map<String,String> messages = new TreeMap<>((s1,s2) -> -s1.compareTo(s2));
		messages.put("Mike","Hello,from Mike!");
	    messages.put("Nancy","I am Nancy");
	    messages.put("LiuTao","hahahaha");


	    //key是不能重复的，如果已存在，默认修改key的值
		//messages.put("Mike","Hello!");
		/*
		获取谁的信息：
		The key does not exist!
		{Mike=Hello!, LiuTao=hahahaha, Nancy=I am Nancy}
		*/

	    /*Scanner console = new Scanner(System.in);
	    out.print("获取谁的信息：");
	    String message = messages.get(console.nextLine());
	    if(message == null){
	    	out.println("The key does not exist!");
		}else {
			out.println(message);
		}*/
		out.println(messages);
    }
}
