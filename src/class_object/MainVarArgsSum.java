package class_object;

public class MainVarArgsSum {
	
	public static void main(String[] args) {
		
		VarArgsSum s = new VarArgsSum();
		s.setValue(10,20,30);
		s.getsum();
		int result = s.getsum();
		System.out.println("Sum is" +result);
		
		
		
		
	}

}
