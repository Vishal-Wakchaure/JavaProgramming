package constructors;

import java.util.Scanner;

public class SquareMain {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		Square s = new Square(no);
		int result = s.getSquare();
		System.out.println("Square is" +result);
	}

}
