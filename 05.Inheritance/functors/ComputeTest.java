package functors;

public class ComputeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] input={1.0, -3.0, 5.0};
		double[] output1=new double[3];
		double[] output2=new double[3];
		double[] output3=new double[4];
		
		Utils.transform(input, output1, new ComputeSquare());
		Utils.transform(input, output2,new ComputeAbsoluteValue());
		
		
		print(output1);
		print(output2);
		
		Utils.transform(input, output3,new ComputeSquare());
		print(output3);
	}


	public static void print(double[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		
		System.out.println();
	}
}
