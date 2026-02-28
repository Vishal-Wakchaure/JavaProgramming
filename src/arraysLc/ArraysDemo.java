package arraysLc;

public class ArraysDemo {
	public static void main(String[] args) {
		
		
		int marks[] = {100,89,56,32,24,89,12,52};
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
				System.out.println(i+ " ");
		}
	}

}
