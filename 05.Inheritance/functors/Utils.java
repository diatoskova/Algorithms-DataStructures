package functors;

public class Utils {

	public static  void transform(double[] input, double[] output, 
			                             ComputeInterface comp)
	{
		if(input.length!=output.length)
			throw new IllegalArgumentException("The two arrays cannot have different size.");
		
		comp.compute(input,output);
	}
}
