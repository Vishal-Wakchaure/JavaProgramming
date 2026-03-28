package Strings;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("vishal");
		sb.append("Java");
		System.out.println(sb);//mutable 
		
		String s = new String("vish");
		s.concat("javaa");
		System.out.println(s);// Immutable 
		
//		constructor
		StringBuffer s1 = new StringBuffer("vishalw");//default capacity : 16
		System.out.println(s1.capacity());
		s1.append("ak");
		System.out.println(s1.capacity());
		
	}

}
