package constructors;

public class Power {
	
	int p,q;
	Power(int p,int q)
	{
		this.p=p;
		this.q=q;
	}
	
	int getPower()
	{
		int p=1;
		for(int i=1;i<=q;i++)
		{
			p=p*q;
		}
		return p;
	}
	
	

}
