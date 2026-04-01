package exception;

public class ThrowsDemo {
	public static void main(String[] args) 
//			throws InterruptedException
	{
		
		for(int i=1;i<=10;i++)
		{
			try {
				System.out.println(i);
				Thread.sleep(1000);
				}
			catch(Exception e)
			{
				System.out.println(i);
			}
			
		}
	}

}
