package class_object;

public class POJOClassApp {
	public static void main(String[] args) {
		
		Company c = new Company();
		Employee e1 = new Employee();
		
		e1.setId(100);
		e1.setAddr("Karvenagar");
		e1.setAge(20);
		e1.setName("Vishal");
		e1.setQual("MCA");
		e1.setSal(20000);
		
		c.addNewEmployee(e1);
		c.showEmployee();
			
	}

}
