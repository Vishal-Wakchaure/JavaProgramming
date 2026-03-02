package day13;

public class StaticMain {
	
	public static void main(String[] args) {
		
		
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		StaticDemo d = new StaticDemo();
		System.out.println(d.b);
		d.m2();
	}

}
