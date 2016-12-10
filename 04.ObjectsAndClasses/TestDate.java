package Examples;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date=new Date();
		System.out.println(date.toString());
		
		Date second=new Date(21,06,1991);
		System.out.println("Didi is born on "+second.toString());
	}

}
