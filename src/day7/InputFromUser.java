package day7;
import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		System.out.println("Given number is" + n);
	}

}
