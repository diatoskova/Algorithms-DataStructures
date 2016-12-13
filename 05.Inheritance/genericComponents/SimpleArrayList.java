package genericComponents;

public class SimpleArrayList {

	private static final int INIT_CAPACITY=10;
	private int theSize=0;
	private Object[] theItems = new Object[INIT_CAPACITY];
	
	public int size()
	{
		return this.theSize;
	}
	
	public Object get(int index) throws Exception
	{
		if(index<0 || index>=size())
		{
			throw new Exception();
		}
		return theItems[index];
	}
	
	public boolean add(Object x)
	{
		if(theItems.length==size())
		{
			Object[] old=theItems;
			theItems=new Object[2*theItems.length+1];
			for(int i=0;i<size();i++)
			{
				theItems[i]=old[i];
			}
		}
		theItems[theSize++]=x;   //?????????
		return true;
	}
}
