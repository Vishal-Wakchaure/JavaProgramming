package day11;

public class StudentMain {
	public static void main(String[] args) {
		
//		Student s = new Student();
//		Using object reference variables 
//		s.sid=101;
//		s.grade ='B';
//		s.sname = "vishal";
//		s.printStudentData();
		
//		Using Method 
//		s.setStudentData(101,"vishal", 'A');
//		s.printStudentData();
////		
//		Using Constructor
		Student s = new Student(101,"vishal",'A');
		s.printStudentData();
		
	}

}
