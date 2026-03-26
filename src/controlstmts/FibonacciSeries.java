package controlstmts;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1");

		int no1 = sc.nextInt();
		System.out.println("Enter no2");

		int no2 = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int sum= no1+no2;
			System.out.println(sum + "");

			
			no1 = no2;
			no2=sum;
		}
		
		
	}

}
