package day9;

public class StringBufferVsStringBuilder {
	
	public static void main(String[] args) {
		
//		 String -- immutable 
//		String s = " Welcome";
//		 s.concat("to java");
//		System.out.println(s);// immutable cannot change original value of s 
//		
//		StringBuffer - Mutable 
		StringBuffer s = new StringBuffer("Welcome");
		s.append("to java");
		System.out.println(s);//mutable - we can change original value of s
		
//		StringBuilder - Mutable 
		
		StringBuilder t = new StringBuilder("Welcome");
		t.append("to java");
		System.out.println(t);
	}

}
