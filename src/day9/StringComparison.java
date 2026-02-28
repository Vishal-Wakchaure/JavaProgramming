package day9;

public class StringComparison {
	
	public static void main(String[] args) {
		//scenario 1 - No difference creating variables in this format
		String s1 = "Welcome";
		String s2 = "Welcome";
				
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
//		Case 2 
		String t1 = new String("Welcome");
		String t2 = new String("Welcome");
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1==t2);//to compare the objects
		System.out.println(t1.equals(t2));//to compare the values of objects
		
//		Case 3 
		String r1 = "abc";
		String r2 = new String("abc");
		
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		
//		Case 4 
		
		String r = "abc";
		String r3 = new String("abc");
		String r4 = r3;
		
		System.out.println(r==r3);
		System.out.println(r.equals(r3));
		
		System.out.println(r3==r4);//True , because objects are same /equal
		
		System.out.println(r==r4);
		System.out.println(r.equals(r4));
		

		
	}

}
