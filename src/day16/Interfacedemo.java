package day16;


interface Shape
{
	int length = 10;//final & static 
	int width = 20; //final & static
	
	void Circle();// abstract method
	
	default void square()
	{
		System.out.println("This is square - default method");
	}
				
	static void rectangle()
	{
		System.out.println("This is rectangle-static method");
	}
	
}

public class Interfacedemo implements Shape {
	
	public void Circle()
	{
		System.out.println("This is circle-abstract method	");
	}
	
	void triangle()
	{
		System.out.println("this is a triangle");
	}
	
	int x=100,y=200;
	public static void main(String[] args) {
		
		//Scenario1
		Interfacedemo idobj = new Interfacedemo();
		idobj.Circle();
		idobj.square();
		idobj.triangle();		
		Shape.rectangle();	//static method directly access from interface
		idobj.triangle();
		System.out.println(idobj.x + idobj.y);
		
		
//		Scenario 2
		Shape sh = new Interfacedemo();
		
		sh.Circle(); //abstract 
		sh.square(); //default
		Shape.rectangle(); //static method can directly access from interface
//		sh.triangle();//we cannot access
		System.out.println(Shape.length * Shape.width);//Accessing static variables directly
		
//		System.out.println(sh.x + sh.y);//We cannot access variable belong to the class but not interface 
		

	}

}