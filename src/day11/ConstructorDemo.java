package day11;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo() //Default constructor
	{
		x=10;
		y=20;
		
	}
	
	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
//		ConstructorDemo d = new ConstructorDemo();//invoke default constructor
		ConstructorDemo d = new ConstructorDemo(10,25);//invoke parameterized constructor
		d.sum();	
		
	}

}
