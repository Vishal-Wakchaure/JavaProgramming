package arraysLc;

public class ArrayExist {
	
	public static void main(String[] args) {
		
		
		int b[] = {10,20,30,40};
		int a=40;
		boolean flag = false;
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==a) {
		   flag=true;
			break;		
		}	 
	}
	if(flag==false)
	{
		System.out.println("element not exist");
	}
	else 
	{
		System.out.println("Element exists");
	}
}

}

