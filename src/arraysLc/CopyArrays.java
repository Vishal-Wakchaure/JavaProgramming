package arraysLc;

import java.util.Scanner;

public class CopyArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements in Array");
		int a[] = new int[5];
		int b[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("first array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
	
		}
		System.out.println("second Array elements");
		for (int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print( b[i] + " ");

		}
		
	}

}
