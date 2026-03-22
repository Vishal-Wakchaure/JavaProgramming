package MyDemo;


	public class POJOAPP 
	{ 
	     public static void main(String x[]) 
	  { 
	      Employee emp = new Employee(); 
	   emp.setId(1); 
	   emp.setName("ABC"); 
	   emp.setSal(10000); 
	   int empid=emp.getId(); 
	   String empname=emp.getName(); 
	   int empsal=emp.getSal(); 
	   System.out.println("Employee id is  "+empid); 
	   System.out.println("Employee Name is "+empname); 
	   System.out.println("Employee Salary is "+empsal); 
	  } 
	}


