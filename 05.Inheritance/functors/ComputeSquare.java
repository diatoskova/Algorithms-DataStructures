package functors;

public class ComputeSquare implements ComputeInterface{

	@Override
	public void compute(double[] arr1, double[] arr2) {
		if(arr1.length!=arr2.length)
			throw new IllegalArgumentException("The two arrays cannot have different size.");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i]*arr1[i];
		}
		
	}

	
}
