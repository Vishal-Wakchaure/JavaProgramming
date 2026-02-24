package day4;

public class AssignmentPrograms {

	public static void main(String[] args) {
		
		//largest of two numbers--> if-else
		
//		 if(a>b)
//			 System.out.println(a + " is greater");
//		 else 
//			 System.out.println(b + " is greater");
		 
//		 Using Ternary operator 
		 
//		int a=10,b=20;
//		String result = (a>b)? "a is greater" : "b is greater";
//		System.out.println(result);
		
		
//		Smallest of 3 Numbers
		
		int a=20,b=2,c=3;
//		if(a<b && a<c)
//		{
//			System.out.println("a is smaller");
//		}
//		else if (b<c && b<a )
//		{
//			System.out.println("b is smaller");
//		}
//		else 
//		{
//			System.out.println("c is smaller");
//		}
		
//		Using Ternary Operator 
		
//		String res = (a<b && a<c) ? "a is smaller" : (b<c && b<a )? "b is smaller" : "c is smaller";
//		System.out.println(res);
		
		String day = "sunday";
		int weekno;
		switch(day.toLowerCase())
		{
		case "monday":
			weekno = 1;
			break;
		case "Tuesday":
			weekno = 2;
			break;
		case "Wednesday":
			weekno = 3;
			break;
		case "Thursday":
			weekno = 4;
			break;
		case "Friday":
			weekno = 5;
			break;
		case "saturday":
			weekno = 6;
			break;
		case "sunday":
			weekno = 7;
			break;
			default:
				weekno=-1;
				System.out.println("invalid day name ");
				
		}
		if (weekno!=-1) {
			System.out.println("week number is " +weekno);
		}
		

	}

}
