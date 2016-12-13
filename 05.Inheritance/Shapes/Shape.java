package Shapes;

public abstract class Shape {

	protected double xCoord;
	protected double yCoord;
	
	public Shape(double x,double y)
	{
		xCoord=x;
		yCoord=y;
	}
	
	public abstract double area();
	public abstract double perimeter();
	
	public double semiperimeter()
	{
		return perimeter()/2;
	}
	
	public double distance(Shape s)
	{
		double dist=0;
		
		dist=Math.sqrt((s.yCoord-yCoord)*(s.yCoord-yCoord)+(s.xCoord-xCoord)*(s.xCoord-xCoord));
		
		return dist;
	}
	
	
}
