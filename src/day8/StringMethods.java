package day8;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "Welcome";
		int l = s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
//		concat-Joining strings
		String s1= "Welcome";
		String s2 = " to Java";
		String s3 = "Automation";
		System.out.println(s1+ " " + s2 + " "+s3);
		System.out.println(s1.concat(s2 + " " +s3));
		
//		trim() - remove spaces from right and left side 
		s= "   Welcome  ";
		System.out.println("Before trimming" + s.length());
		System.out.println("After trimming: " +s.trim().length());
		
//		charAt() - returns a character from a string based on index
		s="Welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		//contains() -->true/false
		s="welcome";
		System.out.println(s.contains("nsh"));
		
		System.out.println(s.contains("wlco"));
		
//		equals,equalsIgnoreCase() ---> compare strings 
		
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals("welcome"));
		
//		replace() -- replace single/multiple (sequence) of characters in a string.
		
		s="welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('s', 'p'));
		System.out.println(s.replace("selenium","cucumber"));
		
//		substring() - extract substring from the main string 
		
		String a = "vishal wak";
		System.out.println(a.substring(0,2));
		
		 a= "vishal wak";
		System.out.println(a.substring(0,4));
		
		String u = "viShal";
		System.out.println(u.toUpperCase());
		System.out.println(u.toLowerCase());
		
//		split() -- split the string into multiple parts based on delimeter.
		s="abc@gmail.com";
		String b[] = s.split("@");
		System.out.println(b[0]);
		System.out.println(b[1]);
		//s="abc,123@xyz";
		
//		Ex.2 
		s="abc,123@xyz";
		
		String arr1[]=s.split(",");  //abc  123@xyz
		System.out.println(Arrays.toString(arr1));  //[123,xyz]
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]);//abc
		System.out.println(arr2[0]);//123
		System.out.println(arr2[1]);//xyz
		
//		Ex 
		String name = "John kneedy";
//		System.out.println(name.contains("john"));
//		System.out.println(name.replace('J','j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
	}
}