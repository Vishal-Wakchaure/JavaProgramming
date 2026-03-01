package day10;

public class MyDemoMain {
	
public static void main(String[] args) {
		
		MyDemo d = new MyDemo();
		d.studentid = 101;
		d.studentName = "vishal";
		d.rollno = 10;
		d.div = 'A';
		d.display();
		
		MyDemo d1 = new MyDemo();
		d1.rollno = 20;
		d1.div = 'B';
		d1.studentid = 102;
		d1.studentName = "Abhishek";
		
		d1.display();
		System.out.println(d1.div);
		
		
		
	}

}
