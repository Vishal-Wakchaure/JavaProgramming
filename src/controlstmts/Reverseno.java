package controlstmts;

public class Reverseno {
	
	public static void main(String[] args) {
		
		int n= 112;
		int revNo = 0;
		while(n!=0)
		{
			int rem = n%10;
			revNo = revNo*10 + rem;
			 n = n/10;
		}
		
		System.out.println("reverse number is" + revNo);
			
	}

}
