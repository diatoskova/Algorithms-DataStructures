package functors2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] input={100,37,49};
		
		boolean result1=contains(input,new PrimeInteger());
		boolean result2=contains(input,new PerfectSquare());
		boolean result3=contains(input,new Negative());
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	public static boolean contains(Comparable[] input,ContainsInterface con)
	{
		return con.contains(input);
	}
}
