package Arrays;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int indexpos =2;
		
		int[] newArr = new int[arr.length-1];
		
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==indexpos)
			{
				continue;
			}
			newArr[j] = arr[i];
			j++;
			
		}
		
		for(int n:newArr)
		{
			System.out.println(n + " ");
		}
	}

}
