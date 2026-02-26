package day7;

public class DuplicateNumberCount {
	
	public static void main(String[] args) {
		
		int a[] = {100,200,300,100,400,100,500};
		int count=0;
		
		for (int value:a)
		{
			if(value==200)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
