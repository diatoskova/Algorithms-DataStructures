
public class FloatingPointNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDivisionByZero();
	}
	
	public static void testDivisionByZero(){
		float a=0.0f;
		float c=2.4f;
		float d=-2.4f;
		
		System.out.println(a/a); //NaN
		System.out.println(c/a); //Infinity
		System.out.println(d/a); //-Infinity
		
		System.out.println(divide(c,d));
		System.out.println(divide(a,a));
	}
	
	public static float divide(float number, float divisor){
		if(divisor==0)
			throw new ArithmeticException("Division by zero is illegal!");
		else
			return number/divisor;
	}

}
