
import java.util.Scanner;
/* 你的代码将被嵌入到这里 */
class Rectangle{
	double wide;
	double high;
	
	Rectangle(double w,double h)
	{
		wide = w ;
		high = h ;
	}
	
	double getArea()
	{
		return wide * high;
	}
	
	double getPerimeter()
	{
		return (wide + high) * 2 ;
	}
}

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double w = input.nextDouble();
    double h = input.nextDouble();
    Rectangle myRectangle = new Rectangle(w, h);
    System.out.println(myRectangle.getArea());
    System.out.println(myRectangle.getPerimeter());

    input.close();
  }
}
