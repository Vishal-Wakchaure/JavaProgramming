package class_object;

public class VarArgs {
	
	void setvalue(String Div,String name,int ...x)
	{
		int sum=0;
		System.out.println("Name is "+name);
		System.out.println("Division is" +Div);
		for(int i=0;i<x.length;i++)
		{
			sum = sum+x[i];
		}
		System.out.println("sum is" +sum);
	}

}
