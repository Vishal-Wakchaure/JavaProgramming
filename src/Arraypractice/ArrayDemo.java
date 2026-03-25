package Arraypractice;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int size,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in Array");
		size = sc.nextInt();
		int a[] = new int[size];
		
		for( i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("printed Array elements");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i] + " ");
		}	
	}

}
