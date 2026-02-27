package arraysLc;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		int size,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		size = sc.nextInt();
		int a[] = new int[size];
		
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("printed Array elemets");
		for(i=0;i<size;i++)
		
		
				{
			          System.out.println(a[i] + " ");
				}
	}

}
