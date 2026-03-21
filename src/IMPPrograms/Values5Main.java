package IMPPrograms;

public class Values5Main {
	
	public static void main(String[] args) {
		Values5 v = new Values5();
		v.setvalue(10,20,30,40,50);
		int result = v.getsum();
		System.out.println("sum is" +result);
	}

}
