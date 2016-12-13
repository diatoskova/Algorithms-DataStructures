package functors2;

public class PerfectSquare implements ContainsInterface<Comparable> {

	@Override
	public boolean contains(Comparable[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(isPerfectSquare(arr[i]))
				return true;
		}
		return false;
	}
	
	private boolean isPerfectSquare(Comparable num)
	{
		if(num.compareTo(0)<0)
			return false;
		if(num.compareTo(1)==1)
			return true;
		for(int i=2;num.compareTo(i)>0;i++)
		{
			if(num.compareTo(i*i)==0)
				return true;
		}
				
		return false;
	}

}
