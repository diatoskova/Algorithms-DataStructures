package functors2;

public class Negative implements ContainsInterface<Comparable>  {

	
	public boolean contains(Comparable[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(0)<0)
				return true;
		}
		return false;
	}

}
