package bank;

public class PlatinumCheckingAccount extends InterestCheckingAccount{

	public PlatinumCheckingAccount()
	{
		super();
	}
	
	public PlatinumCheckingAccount(String name, int num, double bal)
	{
		super(name, num, bal);
	}
	@Override
	public void addInterest() {
		
		increaseInterest(RATE*3);	
	}
}
