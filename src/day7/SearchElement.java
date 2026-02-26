package day7;

public class SearchElement {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int search_element = 3;

		boolean bool = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("element found");
				bool = true;
				break;
				
			}
		}
		if (bool==false)
		{
			System.out.println("element not found");
		}
		
	}

}
