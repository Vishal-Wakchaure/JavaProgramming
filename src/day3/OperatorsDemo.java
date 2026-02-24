package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
//		1)Arithmetic operators --> +,-,*,/,%
		int a=5,b=2;
		System.out.println("Sum of two numbers is " + (a+b));
		System.out.println("Sub of two numbers is " + (a-b));
		System.out.println("Mul of two numbers is " + (a*b));
		System.out.println("Div of two numbers is " + (a/b));
		System.out.println("mod  of two numbers is " + (a%b));
		
//		2)Relational/Comparison operators - >,>=,<,<=,!=,==
//		Returns boolean values True/False
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res = a>b;
		System.out.println(res);
		
//		3) Logical Operators && || !
//		Returns boolean value True/False
//		Works between 2 boolean values or variables.
		
		boolean x = true;
		boolean y = false;
	
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);//false
		
		boolean b2 = 20>10;
		System.out.println(b2);//True
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		System.out.println((10<20) && (20>10));
		System.out.println((30<20) || (5>10));
	}

}
