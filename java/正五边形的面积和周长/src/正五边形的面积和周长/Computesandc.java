package 正五边形的面积和周长;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Computesandc {

	public static void main(String[] args){
		
		 Scanner input = new Scanner(System.in);
		
		 double a = input.nextDouble();
	
		 double s = ( a * a * Math.sqrt(25 + 10 * Math.sqrt(5)))/ 4;
		 double c = 5 * a ; 
		 
		 NumberFormat nf = NumberFormat.getInstance();
		 
		 
		 System.out.println(String.format("%.4f", s));//保留4位小数
		 System.out.println(nf.format(c));//去掉多余的0
	}
}
