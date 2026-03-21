package class_object;

public class VarArgsSum {
	
	int sum=0;
	void setValue(int ...x)
	{
		for(int i=0;i<x.length;i++)
			sum=sum+x[i];
	}
	int getsum()
	{
		return sum;
	}

}
