package day15;


 class Test1 //final
{
	final void m() 
	{
		System.out.println("This is m method from Test1");
	}
}

class Test2 extends Test1  //Incorrect because Test1 is final class.
{
//	void m() // because m is final method
	{
		System.out.println("this is method from test2");
	}
	
}

public class FinalMethod {
	
	public static void main(String[] args) {
		
	}

}
