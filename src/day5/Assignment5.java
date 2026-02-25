package day5;

public class Assignment5 {

	public static void main(String[] args) {
		
//		1.Reverse Number input-->1234 output---->4321
//		2.Palindrome number input 121 after reverse output 121 
//		3.count number of digits in a number  input-->423424 output:6
//		4.count Number of even and odd digits in a number input : 23456 Output:3 even 2 odd
//		5.Find sum of digits in a number input = 1234 o/p sum = 10
		
//		int n = 1234;
//		int rev = 0;
//
//		while (n>0)
//		{
//		    int digit = n % 10;
//		    rev = rev * 10 + digit;
//		    n = n / 10;
//		}
//
//		System.out.println("Reverse number is " + rev);
		
//		2.Palindrome number input 121 after reverse output 121 

//		int n = 121;
//		int orig=n;
//		int rev=0;
//		while(n>0)
//		{
//			int digit = n%10;
//			rev=rev*10+digit;
//			n=n/10;
//			
//		}
//		if(orig==rev)
//			
//		{
//			System.out.println("palindrome");
//			
//		}
//		else 
//		{
//			System.out.println("Not palindrome");
//		}
		
//		3.count number of digits in a number  input-->423424 output:6
//     	int n = 1263636;
//		int count=0;
//		
//		while(n>0)
//		{
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);


		
//		int n = 23456;
//
//		int evenCount = 0;
//		int oddCount = 0;
//
//		while (n > 0)
//		{
//		    int digit = n % 10;
//
//		    if (digit % 2 == 0)
//		        evenCount++;
//		    else
//		        oddCount++;
//
//		    n = n / 10;
//		}
//
//		System.out.println(evenCount + " even " + oddCount + " odd");
//	
		
		int n = 1234;
		int sum = 0;

		while (n > 0)
		{
		    int digit = n % 10;
		    sum = sum + digit;
		    n = n / 10;
		}

		System.out.println("sum = " + sum);
	}
}
