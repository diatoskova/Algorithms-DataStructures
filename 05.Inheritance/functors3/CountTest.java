package functors3;

public class CountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={4,7,0,2,0,0,5,0};
		
		System.out.println(countMatches(arr,new EqualsZero()));
		
		System.out.println("Number of 0s: "+countMatches(arr,new EqualsK(0)));
	}
	
	public static int countMatches(int[] arr, Equaler e)
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(e.equals(arr[i]))
				count++;
		}
		
		return count;
	}

}
