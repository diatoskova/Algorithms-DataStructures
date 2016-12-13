package bank;

public abstract class Account {
	
	private String nameOfHolder;
	private int accountNumber;
	private double balance;
	
	public Account()
	{
		this(null,0,0);
		
	}
	public Account(String name,int num, double balance)
	{
		this.nameOfHolder=name;
		this.accountNumber=num;
		this.balance=balance;
	}

	public double getCurrentBalance()
	{
		return this.balance;
	}
	
	protected void setBalance(double bal)
	{
		this.balance=bal;
	}
	public void add(double money)
	{
		if(money<0)
			throw new IllegalArgumentException("Cannot add negative amount of money.");
		
		this.balance+=money;
	}
	
	public void substract(double money)
	{
		if(money<0)
			throw new IllegalArgumentException("Cannot substract negative amount of money.");
		if(money>getCurrentBalance())
			throw new IllegalArgumentException("Cannot substract amount of money "
					                 + "that is bigger than the current balance.");
		
		this.balance-=money;
	}

	public String toString()
	{
		return this.nameOfHolder+", "+this.accountNumber+", "+this.balance;
	}
}
