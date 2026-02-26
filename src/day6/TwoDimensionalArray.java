package day6;

public class TwoDimensionalArray {
//1)Declare an array 
//2)	Add values into array
//3)	Find size of an array
//4)	Read single value from an array
//5)	Read multiple values from an array
	
	public static void main(String[] args) {
//		Declaring Array 
//		Approach1 
//		int a[] [] = new int[3][2];
//		
//		a[0][0]=100;
//		a[0][1]=200;
//		
//		a[1][0]=300;
//		a[1][1]=400;
//		
//		a[2][0]=500;
//		a[2][1]=600;
//		
//		System.out.println(a[2]);
		
//		Approach2
		int a[][] = {{100,200},{300,400},{500,600,700}};
		
//		Find size of an array 
		System.out.println("length of rows"+a.length);
		System.out.println("length of columns"+a[2].length);
		
//		Read single value from an array 
//		System.out.println(a[2][1]);

//		normal for loop 
//		for(int r=0;r<=2;r++)
//		{
//			for(int c=0;c<=1;c++)
//			{
//				System.out.println(a[r][c]);
//			}
//		}
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
	}
}

