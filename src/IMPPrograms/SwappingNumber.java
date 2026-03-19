package IMPPrograms;

public class SwappingNumber {
	
	public static void main(String[] args) {
		
		/*int a=10, b=20;
//		Logic 1 -Using third variable
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("Swapped numbers are "+"a = "+a  + " b = "+b);*/
		
//		Logic 2 - Use + & - Without using third variable
		
		/*int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped numbers are " +a  +b);*/
		
//		Logic 3- Use * and / without using third variable
//		Here a&b values should not be zero
//		int a=10,b=20;
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("Swapped values are" +a  +b);

//		Logic 4 -Bitwise XOR
		int a=10,b=20;
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After swapping values are" +a+ " "+b);
		
//		Logic 5 - single statement
//		a=10    b=20
		b=a+b-(a=b);
		System.out.println("After swapping values are" +a+ " "+b);
		
		
		
	}

}
