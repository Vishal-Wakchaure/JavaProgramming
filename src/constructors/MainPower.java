package constructors;

import java.util.Scanner;

public class MainPower {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base,index;
		System.out.println("Enter base & index");
		base = sc.nextInt();
		index=sc.nextInt();
		Power p = new Power(base,index);
		int result = p.getPower();
		System.out.println("power is" + result);
		
		
		
	}

}
