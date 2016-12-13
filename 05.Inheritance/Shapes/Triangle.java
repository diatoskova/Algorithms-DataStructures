package Shapes;

public class Triangle extends Shape implements Strechable{

	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double a, double b)
	{
		this(a,b,0,0);
	}
	
	public Triangle(double a, double b,double x,double y)
	{
		super(x,y);
		if(a<=0 || b<=0)
			throw new IllegalArgumentException("Side of triangle cannot be <=0.");
		this.sideA=a;
		this.sideB=b;
		this.sideC=Math.sqrt(a*a+b*b);
	}
	
	
	public double getSideA()
	{
		return this.sideA;
	}
	public double getSideB()
	{
		return this.sideB;
	}
	public double getSideC()
	{
		return this.sideC;
	}
	
	
	public double area()
	{
		return (this.getSideA()*this.getSideB())/2;
	}
	
	public double perimeter()
	{
		return this.getSideA()+this.getSideB()+this.getSideC();
	}
	
	public String toString()
	{
		return "Triangle: "+this.getSideA()+", "
	             +this.getSideB()+", "+this.getSideC();
	}
	@Override
	public void stretch(double factor) {
		if(factor<=0)
			throw new IllegalArgumentException("Factor cannot be <=0.");
		if(this.getSideC()*factor>this.sideA+this.sideB)
			throw new IllegalArgumentException("Stretching with factor "+factor+
					                       " violates the triangle condition.");
		else
			this.sideC=sideC*factor;
		
	}

}
