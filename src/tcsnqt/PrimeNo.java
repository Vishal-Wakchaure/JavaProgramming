package tcsnqt;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int n = 9;
		boolean isprime = true;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isprime = false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println("Number is  prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}	
		
		
	}

}
