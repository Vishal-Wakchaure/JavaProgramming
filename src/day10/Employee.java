package day10;

public class Employee {
	
	int eid;
	String ename;
	String job;
	int sal;
	
//	Methods 
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();//object
		emp1.eid=101;
		emp1.ename="vishal";
		emp1.job = "software developer";
		emp1.sal = 40000;
		emp1.display();
//		System.out.println((emp1.eid));
		
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename ="vishal";
		emp2.job = "software testing";
		emp2.sal = 30000;
		emp2.display();
		
	}

}
