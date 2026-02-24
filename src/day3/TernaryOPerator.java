package day3;

public class TernaryOPerator {
	
	public static void main(String[] args) {
		
//		Syntax = Var=exp? Result1 : result2;
		//Example1 
//		int a=100,b=200;
//		
//		int x=(a>b) ? a:b;//if a>b becomes true then value assigned to a variable whatever it is ,if expression become false then b value printed
//		System.out.println(x);
		
//		Example2
		
//		int x=(1==1)?100:200;
//		System.out.println(x);
		
//		Example 3 
//		int person_age =15;
//		String res = (person_age>=18) ? "Eligible" : "Not Eligible";
//		System.out.println(res);
//		
//		Swapping of two numbers without using temp variable 
//		int a=10,b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		
		int a=10,b=20,c=30;
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
