package bank;

public class InterestCheckingAccount extends Account 
                                     implements InterestBearingAccount {

	protected static final double RATE=5.5;
	
	public InterestCheckingAccount()
	{
		super();
	}
	public InterestCheckingAccount(String name,int num,double balance)
	{
		super(name,num,balance);
	}
	@Override
	public void addInterest() {
	
		increaseInterest(RATE);	
	}
	public void increaseInterest(double rate)
	{
		add(getCurrentBalance()*rate/100);
	}

}
