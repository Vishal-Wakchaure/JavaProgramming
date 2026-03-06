package day18;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch Block Handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("You entered into finally block");
		}
		    System.out.println("Program finished");
	}
	

}
