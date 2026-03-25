package oops;


class Bank 
{
	private String Account_holder;
	private double balance;

public String getAccountHolder()
{
	return Account_holder;
}

public String getAccount_holder() {
	return Account_holder;
}

public void setAccount_holder(String account_holder) {
	Account_holder = account_holder;
}
public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}


public void deposit(double amount)
{
	if(amount>0)
	{
		balance = balance + amount;
		System.out.println("You have deposited" +amount + "RS " );
		System.out.println("New balance is" +getBalance() + "Rs");
	}
	else
	{
		System.out.println("Invalid amount");
	}
}

public void withdraw(double amount)
{
	if(amount>0)
	{
		balance = balance - amount;
		System.out.println("You have withdraw" + amount +"Rs");
		System.out.println("your new balance is" + balance +"Rs");
	}
	else
	{
		System.out.println("Invalid withdraw amount");
	}
}
}
