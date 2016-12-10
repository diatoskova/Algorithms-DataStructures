package Examples;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate my1=new MyDate(1800,2,1);
		MyDate my2=new MyDate(1800,2,3);
		
	
		System.out.println(my1.num());
		System.out.println(my1.toString());
		
		System.out.println(MyDate.substract(my1, my2));
		
	}

}
