package Shapes;
import java.util.ArrayList;

public class TestShapes {

	public static void main(String[] args) {
		

		Shape s1=new Circle(5,5,5);
		Shape s2=new Rectangle(2,3,6,6);
		
		Shape[] arr=new Shape[2];
		arr[0]=s1;
		arr[1]=s2;
		
		double total=totalArea(arr);
		
		System.out.println("Total area: "+total);
		printAll(arr);
		
		ArrayList<Rectangle> sh=new ArrayList<Rectangle>();
		sh.add(new Rectangle(2,3));
		sh.add(new Rectangle(3,5));
		
		strechAll(sh,5);
		
		System.out.println("Distance from s1 to s2: "+s1.distance(s2));
	}

	public static double totalArea(Shape[] figures)
	{
		double total=0;
		
		for(int i=0;i<figures.length;i++)
		{
			if(figures[i]!=null)
				total+=figures[i].area();
		}
		
		return total;
	}

	public static void printAll(Shape[] figures)
	{
		for(Shape s:figures)
		{
			System.out.println(s);
		}
	}

	public static void strechAll(ArrayList<? extends Strechable> arr, int factor)
	{
		for(Strechable s:arr)
		{
			if(s!=null)
				s.stretch(factor);
		}
	}

}
