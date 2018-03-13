package com.company;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    	//正5边形的周长和面积
    	/*DecimalFormat df = new DecimalFormat("#.####");
    	Scanner input = new Scanner(System.in);
	    double a = input.nextDouble();
	    double L = 5*a;
	    double S = a*a*Math.sqrt(25+10*Math.sqrt(5))/4;
	    System.out.println(df.format(S));
	    System.out.println(df.format(L));*/

    	//判断字符串是否能转化为数字
    	/*String str = input.next();
    	try {
			double a = Double.valueOf(str).doubleValue();
			System.out.println("true");
    	}catch (NumberFormatException ex){
    		System.out.println("false");
		}*/

    	//String str = input.nextLine();
    	/*if(str.length() != 11){
    		System.out.println("No");
    		return ;
    	}
    	if(str.charAt(0)!='1'){
    		System.out.println("No");
    		return ;
    	}
    	for(int i = 0;i < 11; i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				continue;
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
    	*/

    	/*if(str.matches("1\\d{10}")) {
    		System.out.println("Yes");
		}else {
    		System.out.println("No");
		}*/

    	/*StringBuffer tmp = new StringBuffer();
		while(true){
			String str;
			str = input.nextLine();
			if(str.equals("end")){
				break;
			}else{
				//加换行符
				tmp.append("\n");
				tmp.append(str);
			}
		}
		String obj = input.next();
		String res = input.next();
		String a = tmp.toString();
		a.replaceAll(obj,res);
		System.out.println(a);*/

    	//大数整除
		/*BigInteger a=new BigInteger(input.next());
		BigInteger b=new BigInteger(Long.MAX_VALUE + "");
		b=b.add(BigInteger.ONE);
		int count = 0;
		while(count < 3){
			if(b.remainder(a).equals(BigInteger.ZERO)){
				System.out.println(b);
				count++;
			}
			b=b.add(BigInteger.ONE);
		}
	}
}