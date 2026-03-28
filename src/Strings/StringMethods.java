package Strings;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "vishal";
		String s1 = "wak";
		String s3 = s1.intern();
		
//		1.length() - returns no. of character in string
		System.out.println(s.length());
		
//		2.charAt(int index) Returns the character at the specified index (0-based)
		
		System.out.println(s.charAt(4));
		
//		3.substring(int begin, int end) -Returns a substring from begin index (inclusive) to end index (exclusive)
		System.out.println(s.substring(1,4));
		
//		4.equals(Object obj) - Compares two strings for equality (case-sensitive).
		System.out.println(s.equals(s1));
		
//		5.equalsIgnoreCase(String str) --Compares two strings ignoring case.
		System.out.println(s1.equalsIgnoreCase(s));
		
//		6.toUpperCase() -- Converts all characters to uppercase.
		System.out.println(s.toUpperCase());
		
//		7.toLowerCase() -- Converts all characters to lowercase.
		System.out.println(s.toLowerCase());
		
//		8.trim() -- Removes leading and trailing spaces.
		System.out.println(s.trim());
		
//		9. concat(String str) --Concatenates (joins) two strings.
		System.out.println(s.concat(s1));
		
//		10. replace(char old, char new) -- Replaces all occurrences of a character with another.
		System.out.println(s.replace('v', 'm'));
		
//		11. contains(CharSequence s) -- Checks if the string contains a sequence of characters. 
		System.out.println(s.contains("ish"));
		
//		12.compareTo(String another) -Compares strings lexicographically (alphabetical order).
		System.out.println(s.compareTo(s1));
		
//		13.intern() -- Returns the canonical representation of a string from the String Constant Pool (SCP). Helps save memory by avoiding duplicate String objects.
		
		System.out.println(s==s3);
		
//		14. valueof() - convert int into string value
		int a = 10,b=20;
		String c = String.valueOf(a);
		System.out.println(c);
		String d = String.valueOf(b);
		System.out.println(d);
		System.out.println(c+d);
		
//		15.toCharArray()
		
		char[] e = s.toCharArray();
		System.out.println(e);
		
//		 + Operator 
		String s4 = "vishal";
		String s5 = "Java";
		System.out.println(s4+s5);
		System.out.println(s4+10);
		System.out.println(s4+10+20);
		System.out.println(10+20+s4);
		System.out.println(10+"vishal"+20);
		System.out.println(s4+20/10);//BODMAS Rule
		System.out.println(s4+20*10);
//		System.out.println(s4+10-5); -error occurs
		
		
	}

}
