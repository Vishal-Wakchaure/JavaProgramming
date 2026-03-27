package arraysLc;

import java.util.Arrays;

public class ArraysMethods {
	
	public static void main(String[] args) {
		
//		toString() Method
		
		String a[] = {"Learn","coding","keypoints","Education"};
		System.out.println(Arrays.toString(a));
		
//		asList() Method
		System.out.println(Arrays.asList(a));
		
//		deeptoString() --> Accepts 2d Arrays
		int arr[][] = {{10,20},{30,40}};
		System.out.println(Arrays.deepToString(arr));
		
	}

}
