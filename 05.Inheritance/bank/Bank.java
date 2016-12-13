package bank;

import java.util.ArrayList;

public class Bank {
	
	ArrayList<Account> accounts;
	
	public Bank()
	{
		accounts=new ArrayList<Account>();
	}
	
	public void addAccount(Account a)
	{
		accounts.add(a);
	}
	
	public double totalAssets()
	{
		double total=0;
		
		for(Account a: accounts)
		{
			total+=a.getCurrentBalance();
		}
		
		return total;
	}

	//invokes the interest for all accounts that are interest-bearing
	public void addInterest()
	{
		for(Account a:accounts)
		{
			if(a instanceof InterestBearingAccount)
				((InterestBearingAccount) a).addInterest();
		}
	}
	
	public void printAll()
	{
		for(Account a:accounts)
		{
			System.out.println(a);
		}
	}
}
