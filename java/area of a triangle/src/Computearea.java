import java.util.Scanner;
import java.text.DateFormat;

public class Computearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double c = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		
		if(a+b>c && b+c>a && a+c>b)
		{
			double p =(a+b+c)/2;
			double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("The area of the triangle is:"+String.format("%.1f",area));
		}
		else
			System.out.println("It is not a triangle ");
	}
}
