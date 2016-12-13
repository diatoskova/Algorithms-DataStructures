package genericComponents;

public class SingleBuffer<AnyType> {

	private AnyType obj;
	private boolean empty=true;
	
	public SingleBuffer(AnyType o)
	{
		this.obj=o;
		this.empty=false;
	}
	
	public SingleBuffer()
	{
		this.obj=null;
	}
	
	public AnyType getObj() throws Exception
	{
		if(this.empty)
			throw new Exception("Cannot get an element from an empty buffer.");
		else
		{
			this.empty=true;
			return this.obj;
		}
	}
	
	public void putObj(AnyType o)
	{
		if(!this.empty)
			System.out.println("Cannot put an item since the buffer is full.");
		else
		{
			this.obj=o;
			this.empty=false;
			System.out.println("SingleBuffer successfully occupied with: "+o.toString());
		}
		
	}
	
	public String toString()
	{
		if(this.empty)
			return "Empty.";
		else
			return this.obj.toString();
	}
	
}
