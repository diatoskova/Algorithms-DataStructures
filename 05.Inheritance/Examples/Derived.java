package Examples;

public class Derived extends Base{

	public int dPublic;
	private int dPrivate;
	
	
	public Derived(int bPub,int bPro, int bPri, int dPub,int dPri)
	{
		super(bPub,bPro,bPri);
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b=new Base();
		Derived d=new Derived();
		
		System.out.println(b.bPublic+b.bProtected+b.bPrivate+d.dPublic+d.dPrivate);
	}
	*/
	
}
