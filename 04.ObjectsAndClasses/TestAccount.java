package Examples;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account(5000);
		System.out.println(a.toString());
		a.deposit(2000);
		a.withdraw(600);
		System.out.println(a.toString());
		
		Account a1=new Account(12);
		a1.withdraw(10);
		
		int[] numbers=new int[1000];
		for(int i=0;i<1000;i++)
		{
			numbers[i]=i;
			
		}
		int counter=0;
		
		for(int i=0;i<1000;i++)
		{
			String str=String.format("%03d ",numbers[i]);
			System.out.print(str);
			counter++;
			
			if(counter==5)
			{
				System.out.println();
				counter=0;
			}
		}
	}

}
