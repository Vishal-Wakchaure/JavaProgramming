package Arrays;

import java.util.Scanner;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements");
		int a[] = new int[5];
		System.out.println("Enter search element");
		int b= sc.nextInt();
		boolean c = false;
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		
	}

}
