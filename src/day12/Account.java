package day12;

public class Account {
	
	private int Accno;
	private String AccName;
	private double amount;
	
	public String getAccName() 
	{
		return AccName;
	}

	public void setAccName(String accName) 
	{
		AccName = accName;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	public void setAccno(int accno) 
	{
		Accno = accno;
	}

	void setaccno(int Accno)
	{
		this.Accno = Accno;
	}
	
	int getAccno()
	{
		return Accno;
	}
	

}
