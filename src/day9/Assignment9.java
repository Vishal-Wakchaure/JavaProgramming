package day9;

public class Assignment9 {
	
//	1.Check string is palindrome or not 
//	String s = "MADAM" o/p- palindrome
//	String s = "welcome" o/p - not plaindrome
	
//	2. Remove junk/special characters in string
	
//	3. How to remove white spaces in a string 
	
//	4.count occurrences of characters in a string
//	5.count words in a string 
	public static void main(String[] args) {
//	
//	String a = "madam";
//	String rev = "";
//	
//	for(int i=a.length()-1;i>=0;i--)
//	{
//		rev=rev+a.charAt(i);
//	}
//	if(a.equals(rev))
//	{
//		System.out.println("palindrome");
//	}
//	else 
//	{
//		System.out.println("Not a palindrome");
		
		
		String a = "abc@123#$";
		
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			
			
//			if(ch>='0' && ch<='9') {
//				continue;
//			}
			
			if(ch>='a' && ch<='z') {
				System.out.print(ch+" ");
			}
			
			
//			if(ch>=0 || ch<=9) {
//				continue;
//			}else {
//			System.out.println(ch);
//		}
		}
		
	}
	}
	


