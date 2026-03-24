package polymorphism;


class A 
{
	void display()
	{
		System.out.println("This is m1 method");
	}
	
}
class B extends A 
{
	void display()
	{
		System.out.println("This is m2 method");
	}
}


public class OverrideMain {
	
	public static void main(String[] args) {
		
		A ref = new B();
		ref.display();
		ref.display();
	}
}


