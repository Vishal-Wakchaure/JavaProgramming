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

	public static void main(String[] args) {
		
		//Scenario1
		Interfacedemo idobj = new Interfacedemo();
		idobj.Circle();
		idobj.square();
		
		Shape.rectangle();	//static method directly access from interface

	}

}
