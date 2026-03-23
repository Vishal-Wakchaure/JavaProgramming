package MyDemo;

public class ConstructorDemo {
	
	int empid;
	String name;
	int sal;
	
	public ConstructorDemo(int eid,String ename,int salary)
	{
		empid = eid;
		name = ename;
		sal = salary;
		System.out.println(empid +" " + name + " " + salary + " ");
	}
	
	
}
