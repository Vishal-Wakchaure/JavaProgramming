package tcsnqt;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n = 121; 
		int rev =0; 
		int temp =n;
		
		while(n!=0)
		{
			rev = rev*10+n%10;
			n=n/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		
		
		
	}

}
