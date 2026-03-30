package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock {
	
	public static void main(String[] args) throws IOException {
		
//		try 
//		{
//			int a =100,b=2,c;
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//		finally
//		{
//			System.out.println("I am in finally block ");
//		}
		
//		try
//		{
//			int a=100,b=0,c;
//			c=a/b;
//			System.out.println(c);
//		}
//		finally 
//		{
//			System.out.println("I am finally block");
//		}
//		System.out.println("Hello"); //Not execute
		
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("d:/abc.txt");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		finally
		{
			//cleanup here
			if(fis!=null)
			{
				fis.close();
			}
			System.out.println("File closed");
		}
//		
					
		
	}

}
