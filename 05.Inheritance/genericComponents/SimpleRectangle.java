package genericComponents;

public class SimpleRectangle {

	private int length;
	private int width;
	
	public SimpleRectangle(int len, int wid)
	{
		this.length=len;
		this.width=wid;
	}
	
	public int getLength()
	{
		return this.length;
	}
	public int getWidth()
	{
		return this.width;
	}
	
	public String toString()
	{
		return "Simple Rectangle: "+getLength()+" by "+getWidth();
	}
}
