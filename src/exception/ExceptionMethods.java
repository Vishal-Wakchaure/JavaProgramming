package exception;

public class ExceptionMethods {
	
	public static void main(String[] args) {
		
		try 
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
//			e.printStackTrace(); --> prints exception name, description & stack trace
//			System.out.println(e);  -->  prints exception name, description not prints  stack trace
//			System.out.println(e.toString()); -->  prints exception name, description not prints  stack trace
//			System.out.println(e.getMessage()); prints only description of exception not prints exception name & stack trace.
		}
		
		
		
		
		
	}

}
