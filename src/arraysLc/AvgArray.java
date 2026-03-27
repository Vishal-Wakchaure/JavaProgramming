package arraysLc;

public class AvgArray {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		
		int sum=0;
		double avg ;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("sum of array is " + sum );

            avg = sum/5.0;
            {
            	System.out.println("Average of Array is " + avg);
            }
	}

}
