
abstract class Vehicle 
 {
	 int no_of_tyres;
	 void displayTyres()
	 {
		 System.out.println("No_of_Tyres : " + no_of_tyres);
	 }
	 
	 abstract void start();
 }
 
 class Car extends Vehicle 
 {
	 void start()
	 {
		 no_of_tyres = 4;
		 System.out.println("Car starts with key ");
	 }
 }
 class Scooter extends Vehicle
 {
	 void start()
	 {
		 no_of_tyres = 2;
		 System.out.println("Scooter Starts with kick ");
	 }
 }

public class Abstraction {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		car.start();
		car.displayTyres();
		
		System.out.println("=================================");
		
		Vehicle scooter = new Scooter();
		scooter.start();
		scooter.displayTyres();
			
	}
}
