package Examples;

public class TestBigRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigRational b1=new BigRational();
		System.out.println(b1.toString());
		
		BigRational b2=new BigRational("2/4");
		System.out.println(b2.toString());
		
		System.out.println("1/2 na stepen 2: "+b2.pow(2));
		
		//BigRational b3=new BigRational("0/0");
		//System.out.println(b3.toString());
		
		BigRational b4=new BigRational("2");
		System.out.println(b4.toString());
		System.out.println("BigInteger:"+b4.toBigInteger());
		System.out.println("Integer:"+b4.toInteger());
		
		
		System.out.println(b4.divide(b2));
		System.out.println(b4.divide(b1));
		
		//BigRational b5=new BigRational("2/a");
		//System.out.println(b5.toString());
		System.out.println(" ----------------------- ");
		
		BigRational rat1=new BigRational("5/20");
		BigRational rat2=new BigRational("4/16");
		System.out.println(rat1.toString()+" comared to "+rat2.toString()+" : "
		                   +rat1.compareTo(rat2));
	}

}
