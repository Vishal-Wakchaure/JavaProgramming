package arraysLc;

import java.util.Scanner;

public class ArrayLengt {
	public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of Array");
	int n = sc.nextInt();
	System.out.println("Enter elements in Array");
	int a[] = new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Array elements");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i] + " ");
	}
	System.out.println("Array length is " + a.length);

}
}