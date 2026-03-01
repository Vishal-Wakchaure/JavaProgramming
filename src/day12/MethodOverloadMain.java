package day12;

public class MethodOverloadMain {
	
	public static void main(String[] args) {
		
		MethodOverload m = new MethodOverload();
		
		m.sum();//1 
		
		m.sum(20, 30);//2
		
		m.sum(20,20.5);//3
		
		m.sum(20.5, 30);//4
		
		m.sum(10,20,30);//5
		
	
	}

}
