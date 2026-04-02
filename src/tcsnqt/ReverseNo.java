package tcsnqt;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		int n = 1223;
		int temp=n;
		int rev =0;
		while(n!=0)
		{
			int digit = n%10;
			rev = rev*10+digit;
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
		System.out.println("Reverse number is " +rev);

	}

}
