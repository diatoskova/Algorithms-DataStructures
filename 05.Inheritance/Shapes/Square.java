package Shapes;

public class Square extends Shape implements Comparable<Square>{

	private double side;
	
	public Square(double side)
	{
		super(0,0);
		if(side<=0)
			throw new IllegalArgumentException("Side of square cannot be <=0.");
		this.side=side;
	}
	
	public Square(double side,double x,double y)
	{
		super(x,y);
		if(side<=0)
			throw new IllegalArgumentException("Side of square cannot be <=0.");
		this.side=side;
	}
	
	public double area()
	{
		return this.getSide()*this.getSide();
	}
	
	public double perimeter()
	{
		return this.getSide()*4;
	}
	
	public double getSide()
	{
		return this.side;
	}
	public String toString()
	{
		return "Square: "+this.getSide();
	}
	
	@Override
	public int compareTo(Square otherSquare) {
		
		if(this.getSide()>otherSquare.getSide())
			return 1;
		else if(this.getSide()<otherSquare.getSide())
			return -1;
		else
			return 0;
	}

}
