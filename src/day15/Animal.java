package day15;

public class Animal {
	
	String color = "white";	
	
	void eat()
	{
		System.out.println("Eating.");
	}
}
class Dog extends Animal
{
	String color="black";
	
	void displaycolor()
	{
		System.out.println(super.color);
		System.out.println(color);
	}
	
	void eat()
	{
		System.out.println("Eating Biscuit");
		super.eat();;
	}
}
