package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] capital = {
                {"江苏","南京"},
                {"浙江","杭州"},
                {"安徽","合肥"},
                {"山东","济南"},
                {"山西","太原"},
                {"陕西","西安"},
                {"四川","成都"},
                {"云南","昆明"},
                {"广东","广州"},
                {"广西壮族自治区","南宁"},
                {"贵州","贵阳"},
                {"江西","南昌"},
                {"福建","福州"},
                {"湖北","武汉"},
                {"湖南","长沙"},
                {"河北","石家庄"},
                {"河南","郑州"},
                {"甘肃","兰州"},
                {"青海","西宁"},
                {"辽宁","沈阳"},
                {"吉林","长春"},
                {"黑龙江","哈尔滨"},
                {"海南","海口"},
                {"新疆维吾尔族自治区","乌鲁木齐"},
                {"西藏藏族自治区","拉萨"},
                {"宁夏回族自治区","银川"},
                {"内蒙古自治区","呼和浩特"},
                {"台湾","台北"},
                {"香港特别行政区","香港"},
                {"澳门特别行政区","澳门"},
                {"北京","北京"},
                {"上海","上海"},
                {"天津","天津"},
                {"重庆","重庆"},





        };

        List<String[]> list = Arrays.asList(capital);
        Collections.shuffle(list);

        int correctCount = 0;

        Scanner input = new Scanner(System.in);

        int i;
        for( i=0;i<10;i++)
        {
            System.out.printf("%d、",i+1);
            System.out.print(((String[])(list.get(i)))[0] + "的省会是哪个城市?\n");
            String answer = input.nextLine();
            if(answer.equals(((String[])(list.get(i)))[1])){
                System.out.println("回答正确");
                correctCount++;
            }else{
                System.out.println("回答错误，"+((String[])(list.get(i)))[0] +
                        "的省会是"+((String[])(list.get(i)))[1]);
            }
        }
        System.out.printf("共有%d道题目，你一共答对了%d题，好厉害啊！",i,correctCount);
    }
}
