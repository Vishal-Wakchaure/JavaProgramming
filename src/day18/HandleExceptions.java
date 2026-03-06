package day18;

import java.util.Scanner;

public class HandleExceptions {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		try 
		{
		System.out.println(100/n); //Arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid data");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}
}
