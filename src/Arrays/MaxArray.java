package Arrays;

import java.util.Scanner;

public class MaxArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int a[] = new int[5];
		
		System.out.println("Enter values in Array");
		for(int i=1;i<a.length;i++)
		{
			a[i] =sc.nextInt();
		}
		 int max=a[0];
		 for(int i=1;i<a.length;i++)
	    {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println("Maximum value is " + max);
	}

}
