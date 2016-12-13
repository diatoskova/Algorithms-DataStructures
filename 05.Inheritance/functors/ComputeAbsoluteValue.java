package functors;

public class ComputeAbsoluteValue implements ComputeInterface {

	@Override
	public void compute(double[] arr1, double[] arr2) {
		if(arr1.length!=arr2.length)
			throw new IllegalArgumentException("The size of the two arrays cannot be different.");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=Math.abs(arr1[i]);
		}
		
	}

}
