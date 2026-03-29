package exception;

import java.io.FileInputStream;

public class TryCatch {
	
	public static void main(String[] args) {
		
//		try 
//		{
//			int a=100,b=0,c;
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("You cannot divide by zero");
//		}
		
		try 
		{
//			FileInputStream fis = new FileInputStream("d:/abc.txt");
			Class.forName("com.mysql.jdbc.Driver");
		
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
