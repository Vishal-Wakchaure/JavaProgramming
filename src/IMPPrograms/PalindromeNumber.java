package IMPPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		
		int n = sc.nextInt();
		int org_num=n;
		int rev=0;
		
		while(n!=0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		if(org_num==rev)
		{
			System.out.println(org_num + " is palindrome number");
		}
		else
		{
			System.out.println(org_num + " is not palindrome number");
		}
	}

}
