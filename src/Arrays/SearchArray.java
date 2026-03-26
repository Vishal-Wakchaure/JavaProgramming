package Arrays;

public class SearchArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int element =60;
		boolean result = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println("Element found at" +i+ "index position");
				result =true;
				break;
			}
		}
			if(!result)
			{
				System.out.println("Element not found");
			}
		}
		
	}


