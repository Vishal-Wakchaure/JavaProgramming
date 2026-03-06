package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program is started....");
		System.out.println("Program in progress...");
		
		
		Thread.sleep(5000);
		FileInputStream file = new FileInputStream("C:\\TEXT.txt");
		System.out.println("program finished");
		System.out.println("Program exited");		
	}
}
