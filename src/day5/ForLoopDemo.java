package day5;

public class ForLoopDemo {
	
	public static void main(String args[])
	{
//		//1....10 numbers
//		for(int i=1;i<=10;i++)
//		{
//	 System.out.println(i);
//		}
		
//		Even Numbers between 1 --10
		
//		for(int i=2;i<=10;i+=2)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(i+ " Number is even ");
//			}
//			else 
//			{
//				System.out.println(i+ " Number is odd");
//			}
//		}
		
//		Example 10------------------1 desc
//		for(int i=10;i<=1;i--)
//		{
//			System.out.println(i);
//		}
		//Jumping statement -break
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) {
//				break;
//				
//			}
//			{
//				System.out.println(i);
//			}
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==3 || i==9) {
				continue;
			}
			{
				System.out.println(i);
			}
		}

	}
}
