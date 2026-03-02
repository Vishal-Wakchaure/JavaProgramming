package day13;

public class StaticTestMain {
	
	public static void main(String[] args) {
		
		System.out.println(StaticTest.s);
//		System.out.println(StaticTest );
//		System.out.println(StaticTest.display());
//		StaticTest.display();
		
		StaticTest t = new StaticTest();
		t.display();
		
	}

}
