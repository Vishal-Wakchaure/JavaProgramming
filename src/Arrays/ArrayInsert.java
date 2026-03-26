package Arrays;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int indexpos =2;
		int element =100;
//		1.Create new Array
		
		int newArr[] = new int[arr.length+1];
		
//	     2. copy paste the element from old array to new Array till indexpos-1
		for(int i=0;i<indexpos;i++)
		{
			newArr[i] = arr[i];
		}
//		3. Insert provided element at particular index
		newArr[indexpos] = element;

//		4.copy paste the pending elements from old array to new array
		
		for(int i=indexpos;i<arr.length;i++)
		{
			newArr[i+1] = arr[i];
		}
//	    5. Traverse Array 
		
		for(int no:newArr)
		{
			System.out.println(no);
		}
	}
}
