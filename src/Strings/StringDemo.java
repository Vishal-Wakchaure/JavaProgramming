package Strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
//		String s1 = "vishal"; // 1 object creates
//		String s2 = new String("abc");// 2 object creates.
//		
//		String s = new String("vishal");//No Argument constructor creates empty object 
//		System.out.println(s.isEmpty());
//		
//	    StringBuffer sb = new StringBuffer("vishal");
//		StringBuilder sb = new StringBuilder("vishal");
//		byte[] b = {101,102,103};
		char[] c = {'A','B','C'};
		String s3 = new String(c);
//		String s2 = new String(b);//byte array can be passed to string constructor
//	    String s2 = new String(sb);
	    System.out.println(s3);
	    
	    char[] s1 = new char[] {'a','b','c'};
	    
	    String s2 = new String("abc");
	    System.out.println("s1 " +s1); //so char array is very better way to declare password
	    System.out.println("s2 " +s2);
	
	
	}

}
