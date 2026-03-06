package day17;

public class DataConversionMethods {
	
	public static void main(String[] args) {
		
//		String--> int 
//		String s= "12345";//cannot convert to int
//		int sint = Integer.parseInt(s);
//		
//		String s1 = "10";
//		String s2 = "20";
//		System.out.println(Integer.parseInt(s2)+Integer.parseInt(s1));
		
//		String --->double 
		
//		String s1 = "10.5";
//		String s2 = "20.0";
//		
//		System.out.println(Double.parseDouble(s1)+ Double.parseDouble(s2));
		
//		String ---> Boolean
//		String s = "vishal";//other than string by default it returns false
//		System.out.println(Boolean.parseBoolean(s));
		
//		int,double,boolean,char ---> String
		int a=10;
		double d=10.5;
		char c = 'A';
		boolean bool = true;
		
//		System.out.println(String.valueOf(a));
//		System.out.println(String.valueOf(d));
//		System.out.println(String.valueOf(c));
//		System.out.println(String.valueOf(bool));
		
		String s = String.valueOf(a);
		System.out.println(s);
		
		  s  = String.valueOf(d);
		System.out.println(d);
		
		s= String.valueOf(c);
		System.out.println(s);
		
		s= String.valueOf(bool);
		System.out.println(bool);
	}

}
