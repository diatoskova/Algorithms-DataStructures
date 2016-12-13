package functors3;

public class EqualsK implements Equaler{

	private int k;
	
	public EqualsK()
	{
		this(0);
	}
	
	public EqualsK(int k)
	{
		this.k=k;
	}
	
	
	
	@Override
	public boolean equals(int el) {
		if(el==k)
			return true;
		else
			return false;
	}

}
