package class_object;

public class ClassRoom {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("vishal");
		s1.setPercent(80.5f);
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("saurabh");
		s2.setPercent(70);
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("Abhi");
		s3.setPercent(60.7f);
		
		AddStudent ad = new AddStudent();
		ad.addStudent(s1,s2,s3);
		ad.showStudents();
		
		
	}

}
