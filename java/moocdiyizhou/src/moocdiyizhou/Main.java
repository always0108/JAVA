package moocdiyizhou;

import java.util.Scanner;


class Fraction 
{
	int m;
	int n;
	
	//类不是函数，不能用函数的方式来传参
	//代参构造方法，为创建对象时使用，初始化Fraction
	Fraction(int p, int q)
	{
		m = p;
		n = q;
	}
	
	//将分数转换为double
	double toDouble(int  m , int n)
	{
		double result = (m*1.0)/n;
		return result;
	}
    
	//将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。
	Fraction plus(Fraction r)
	{
		Fraction result = new Fraction((m*r.n+n*r.m),n*r.n);
		return result;
	}
    
	//将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
	Fraction multiply(Fraction r)
	{
		Fraction result = new Fraction(m*r.m,n*r.n);
		return result;
	}
	
	int gcd(int a, int b)
	{
	    int c;
	    while(b!=0)  /* 余数不为0，继续相除，直到余数为0 */   
	    { c=a%b; a=b;  b=c;}  
	    return a;
	}
	
	//将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
	void print()
	{
		if(m == n)
		{
			System.out.println("1");
		}else{
			int num = gcd(m,n);
			System.out.println((m/num)+"/"+(n/num));
		}
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}


