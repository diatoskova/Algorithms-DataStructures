package Examples;

public class Account {

	private double balance;
	
	public Account()
	{
		this(0);
	}
	public Account(double balance)
	{
		if(balance<0)
			throw new IllegalArgumentException("Balance cannot be negative.");
		
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void deposit(double dep)
	{
		this.balance+=dep;
	}
	
	public void withdraw(double money)
	{
		if(money>this.balance)
			throw new IllegalArgumentException("Cannot withdraw more money than the balance.");
		else
		{
			this.balance-=money;
		}
	}
	
	public String toString()
	{
		return "Balance of account: "+this.balance;
	}
	
	
}
