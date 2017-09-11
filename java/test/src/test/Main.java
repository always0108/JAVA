package test;

class printtest
{
	int m;
	int n;
	
	printtest(int p ,int q)  //代参构造方法，为创建对象时使用，初始化Tip
	{
		m = p ;
		n = q ;
	}
	
	void print()
	{
		System.out.println(m);
		System.out.println(n);
		
	}
}

public class Main {

	public static void main(String[] args) 
	{
		printtest test = new printtest(5,6);
		test.print();
	}
}


