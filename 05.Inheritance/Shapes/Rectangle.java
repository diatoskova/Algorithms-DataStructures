package Shapes;

public class Rectangle extends Shape implements Strechable{

	private double length;
	private double width;
	
	public Rectangle(double len,double wid)
	{
		super(0,0);
		if(len<=0 || wid<=0)
			throw new IllegalArgumentException("Length or width cannot be <=0.");
		this.length=len;
		this.width=wid;
	}
	
	public Rectangle(double len,double wid,double x,double y)
	{
		super(x,y);
		if(len<=0 || wid<=0)
			throw new IllegalArgumentException("Length or width cannot be <=0.");
		this.length=len;
		this.width=wid;
	}
	
	public double area()
	{
		return this.length*this.width;
	}
	
	public double perimeter()
	{
		return 2*(this.length+this.width);
	}
	
	public String toString()
	{
		return "Rectangle: "+ this.getLength()+", "+this.getWidth();
	}
	
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	public void stretch(double factor)
	{
		if(factor<=0)
			throw new IllegalArgumentException("Factor cannot be <=0.");
		if(this.length>this.width)
			this.length*=factor;
		else
			this.width*=factor;
	}
}
