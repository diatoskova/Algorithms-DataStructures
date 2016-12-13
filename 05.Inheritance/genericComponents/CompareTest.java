package genericComponents;

public class CompareTest {
	
	


	public static void main(String[] args) {
		
		SimpleRectangle[] rect=new SimpleRectangle[4];
		
		rect[0]=new SimpleRectangle(1,10);
		rect[1]=new SimpleRectangle(20,1);
		rect[2]=new SimpleRectangle(4,6);
		rect[3]=new SimpleRectangle(5,5);
		
		class OrderRectByWidth implements Comparator<SimpleRectangle>{

			public int compare(SimpleRectangle r1,SimpleRectangle r2)
			{
				return (r1.getWidth()-r2.getWidth());
			}
		}
		
		System.out.println("Rectangle with max width: "+
		        Utils.findMax(rect,new OrderRectByWidth()));

	}

}
