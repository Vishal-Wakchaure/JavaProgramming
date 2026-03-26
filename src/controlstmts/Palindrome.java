package controlstmts;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n = 121;
		int rev = 0;
		int orig =n;
		
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
	
		if(orig==rev)
		{
			System.out.println("Number is palindrome");
		}
	    else
		{
			System.out.println("Number is not palindrome");
		}
	}

}