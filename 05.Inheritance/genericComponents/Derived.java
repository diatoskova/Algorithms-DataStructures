package genericComponents;

public class Derived extends Base{

	public void foo(Base b)
	{
		System.out.println("Derived.Base");
	}
	
	public void foo(Derived b)
	{
		System.out.println("Derived.Derived");
	}
	
	
}
