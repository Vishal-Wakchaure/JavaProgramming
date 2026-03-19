package IMPPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int n = sc.nextInt();//1234
		
//		1.Using algorithm
		
//		int rev=0;
//		while(n!=0)
//		{
//			rev=rev*10+n%10;
//			n=n/10;
//			
//		}
		
//		Using StringBuffer class
		
//		StringBuffer sb = new StringBuffer(String.valueOf(n));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reverse number is " +rev);
		
//		Using StringBuilder class
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(n);
		StringBuilder rev1 =sb1.reverse();
		System.out.println("Reverse number is " +rev1);
		
		
	}

}
