package day11;

public class GreetingsMain {
	
	public static void main(String[] args) 
	{
		Greetings g = new Greetings();
		g.m1();//1
		
		String s = g.m2();//2
		System.out.println(s);
		
		g.m3("vishal");//3
		
		String var = g.m4("vishal wak");//4
		System.out.println(var);
		
	}

}
