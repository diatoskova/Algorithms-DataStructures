package Shapes;

public class Circle extends Shape implements Comparable<Circle>{

	private double radius;
	private double area;
	//private double xCoord;
	//private double yCoord;
	
	public Circle(double radius)
	{
		super(0,0);
		if(radius<=0)
			throw new IllegalArgumentException("Radius cannot be <=0.");
		this.radius=radius;
		
		this.area=area();
	}
	
	public Circle(double radius,double x,double y)
	{
		super(x,y);
		if(radius<=0)
			throw new IllegalArgumentException("Radius<=0");
		
		this.radius=radius;
	}
	
	
	public double getX()
	{
		return xCoord;
	}
	
	public double getY()
	{
		return yCoord;
	}
	
	public final double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public String toString()
	{
		return "Circle: "+this.getRadius();
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	

	@Override
	public int compareTo(Circle o) {
		if(this.radius>o.radius)
			return 1;
		else if(this.radius<o.radius)
			return -1;
		else
			return 0;
	}
	
	/*public double distance(Circle s)
	{
		double dist=0;
		
		dist=dist=Math.sqrt((s.yCoord-yCoord)*(s.yCoord-yCoord)+(s.xCoord-xCoord)*(s.xCoord-xCoord));
		return dist;
	}*/
}
