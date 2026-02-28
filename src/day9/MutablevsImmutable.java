package day9;

import java.util.Arrays;

public class MutablevsImmutable {
	
	public static void main(String[] args) {
		
		int a[] = {20,10,40,30,50};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);//mutable
		
		System.out.println(Arrays.toString(a));
		
//		immutable - 
		String s = new String("Welcome");
		System.out.println(s);
		
		String b = s.concat(" to java");
		System.out.println(b); // Welcome--immutable-we cannot change
	}

}
