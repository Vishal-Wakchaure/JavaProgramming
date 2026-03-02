package day13;

public class StaticDemo {
	
	static int a=10;//static variable
	static int b=20; //Non static variable
	
	static void m1() //static method
	{
		System.out.println("This is m1 static method");
	}
	
	void m2() 
	{
		System.out.println("This is non static method");
	}
	
	 void m()//non static method
	{
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
	
	}
	
	public static void main(String[] args) {
		
		
//		// 1) static methods can access static stuff directly(without object)
//		System.out.println(a);
//		m1();
//		
//		System.out.println(b);//cannot access , b is non-static 
////		m2();// cannot access , m2() is non-static 
//		
//		StaticDemo d = new StaticDemo();
//		{
//			d.m();
//		}
		StaticDemo d = new StaticDemo();
		d.m();
	}
	
	

}
