package class_object;

public class AddStudent {
	
	Student stud[];
	void addStudent(Student ...s)
	{
	   stud=s;
	}
	
	void showStudents()
	{
		for(int i = 0; i < stud.length; i++) {
		    System.out.println(stud[i].getId() + " " + stud[i].getName() + " " + stud[i].getPercent());
		}	}

}
