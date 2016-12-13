package genericComponents;

public class Utils {

	public static <AnyType> AnyType findMax(AnyType[] a, Comparator<? super AnyType> cmp)
	{
		int maxIndex=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(cmp.compare(a[i], a[maxIndex])>0)
			{
				maxIndex=i;
			}
		}
			
		return a[maxIndex];
	}
}
