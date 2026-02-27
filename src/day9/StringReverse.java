package day9;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any string");
//
//		String s = sc.next();
//
//		
//		String rev = " ";
//		
//		
//		for(int i=s.length()-1;i>=0;i--)			
//		{
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
//		
//		Approach2 -> By converting string to char array type 
		String s1 = "vihal";
		String reverse = "";
		
		char a[] = s1.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			reverse = reverse+a[i];
		}
		System.out.println("Reverse string is" +reverse);
	}
	

}
