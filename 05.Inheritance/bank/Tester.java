package bank;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank=new Bank();
		
		Account a1=new InterestCheckingAccount("John",1,1000);
		Account a2=new NonInterestCheckingAccount("An",2,1000);
		Account a3=new PlatinumCheckingAccount("Sasha",3,1000);
		
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);
		
		bank.printAll();
		
		System.out.println();
		
		bank.addInterest();
		bank.printAll();
	}

}
