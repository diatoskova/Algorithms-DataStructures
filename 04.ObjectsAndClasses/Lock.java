package Examples;

public class Lock {

	private int[] combination;
	
	public Lock(int n1,int n2,int n3)
	{
		if(n1<0 || n1>9 || n2<0 || n2>9 || n3<0 || n3>9)
		{
			throw new IllegalArgumentException("The numbers should be in the range 0-9");
		}
		
		combination[0]=n1;
		combination[1]=n2;
		combination[2]=n3;
	}
	
	public boolean open(int[] comb)
	{
		if(comb.length!=combination.length)
			return false;
		for(int i=0;i<combination.length;i++)
		{
			if(comb[i]!=combination[i])
				return false;
		}
		
		System.out.println("Lock successfully opened.");
		return true;
	}
	public void changeCombo(int[] old,int[] newComb)
	{
		if(old.length!=combination.length || newComb.length!=combination.length)
			return;
		for(int i=0;i<combination.length;i++)
		{
			if(old[i]!=combination[i])
				return;
		}
		for(int i=0;i<combination.length;i++)
		{
			combination[i]=newComb[i];
				
		}
		
	}
}
