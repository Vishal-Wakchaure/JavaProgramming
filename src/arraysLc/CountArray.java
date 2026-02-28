package arraysLc;

public class CountArray {
	
	public static void main(String[] args) {
		
		int a[] = { 10,20,30,40,50};
		int count=0;
		int n=20;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>n)
			{
				count++;
			}
		}
		System.out.println(count);
}
}