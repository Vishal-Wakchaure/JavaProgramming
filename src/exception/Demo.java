package exception;

import java.io.FileInputStream;

public class Demo {
	
	public static void main(String[] args) {
		
//		FileInputStream fis = new FileInputStream("d:/abc.txt");// Exception checks at compile time so it was checked exception.
//		Class.forName("com.mysql.jdbc.Driver");
		
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);// Not exception occurred at compile time , Exception occurred at runtime so it was unchecked exception.
		
		
		
		
	}

}
