package Shapes;

public class Ellipse extends Shape{

	private double diameterA;
	private double diameterB;
	
	public Ellipse(double a,double b)
	{
		super(0,0);
		if(a<=0 || b<=0)
			throw new IllegalArgumentException("Length or width of ellipse cannot be <=0.");
		
		this.diameterA=a;
		this.diameterB=b;
	}
	public Ellipse(double a,double b,double x,double y)
	{
		super(x,y);
		if(a<=0 || b<=0)
			throw new IllegalArgumentException("Radius<=0");
		
		this.diameterA=a;
		this.diameterB=b;
	}
	
	
	public double getX()
	{
		return xCoord;
	}
	
	public double getY()
	{
		return yCoord;
	}
	
	
	public double getDiameterA()
	{
		return this.diameterA;
	}
	public double getDiameterB()
	{
		return this.diameterB;
	}
	
	public double area()
	{
		return getDiameterA()*getDiameterB()*Math.PI;
	}
	
	public double perimeter()
	{
		double sq=Math.sqrt((diameterA*diameterA+diameterB*diameterB)/2);
		return 2*Math.PI*sq;
	}
	
	public String toString()
	{
		return "Ellipse: "+getDiameterA()+", "+getDiameterB();
	}
}
