package IMPPrograms;

public class Cube {
	int no;
	
	void setvalue(int n)
	{
		no =n;
		System.out.println("value of no is" +n);
	}
	
	int getcube()
	{
		int result =no*no*no;
		System.out.println("cube is " +result);
		return result;
	}
}
