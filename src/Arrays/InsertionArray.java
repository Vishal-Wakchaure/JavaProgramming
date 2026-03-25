package Arrays;

public class InsertionArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		int indexpos = 2;
		int element = 100;
		
//		1 . create new Array
		int[] newArr = new int[arr.length+1];
		
//		2.Copy paste the elements for old Array to new Array till indexpos-1
		
		for(int i=0;i<indexpos;i++)
		{
			newArr[i] = arr[i];
		}
//		3. Insert provided element at particular index pos
		newArr[indexpos] = element;
		
//		4. Copy paste the pending elements from old array to new Array
		for(int i=indexpos;i<arr.length;i++)
		{
			newArr[i+1] =arr[i];
		}
//		5. Traverse the Array & print elements.
		for(int newArray:newArr)
		{
			System.out.println(newArray);
		}
	}

}
