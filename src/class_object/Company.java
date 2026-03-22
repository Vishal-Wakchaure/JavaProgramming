package class_object;

public class Company {
	
	Employee emp1;
	void addNewEmployee(Employee emp) {
		emp1=emp;
	}
	
	void showEmployee()
	{
		System.out.println("Id is" +emp1.getId());
		System.out.println("Address of student is" +emp1.getAddr());
		System.out.println("Age of student is" +emp1.getAge());
		System.out.println("Name of student is" +emp1.getName());
		System.out.println("Qual of student is"+emp1.getQual());
		System.out.println("Salary of student is" +emp1.getSal());
	}
	

}
