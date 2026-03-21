package class_object;

public class MainCube {
	public static void main(String[] args) {
		
		Cube c = new Cube();
		c.setvalue(20);
		c.getcube();
		int result = c.getcube();
		System.out.println("cube is "+result);
		
	}

}
