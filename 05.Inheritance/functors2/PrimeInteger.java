package functors2;

public class PrimeInteger implements ContainsInterface<Integer>{

	
	public boolean contains(Integer[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
				return true;
		}
		return false;
	}
	
	private boolean isPrime(Integer num)
	{
		if(num.compareTo(0)<0)
			num=-num;
		
		for(int i=2; num.compareTo(i)>0;i++)
		{
			if(  (double)num%i==0   )
				return false;
		}
		
		return true;
	}

}
