package genericComponents;

public class StaticParamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Base b=new Base();
		 Derived d=new Derived();
		 
		 whichFoo(b,b);
		 whichFoo(b,d);
		 whichFoo(d,b);
		 whichFoo(d,d);
		 
	}
	
	public static void whichFoo(Base b1,Base b2)
	{
		b1.foo(b2);
	}

}
