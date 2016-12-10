package Examples;

public class BinaryArray {

	private boolean[] values;
	
	public BinaryArray(String str)
	{
		int len=str.trim().length();
		values=new boolean[len];
		for(int i=0;i<len;i++)
		{
			if(illegal(str.charAt(i)))
			{
				throw new IllegalArgumentException(
						"The string may contain only the characters 'T' and 'F'");
			}
			else if(str.charAt(i)=='T')
				values[i]=true;
			else
				values[i]=false;
		}
	}
	
	public void setValueAt(int position,boolean value)
	{
		if(values==null )
		{
			System.out.println("There is no sequence of values created.");
			return;
		}
		else
		{
			if(position<0 || position>values.length)
			{
				System.out.println("The position cannot be <0 or bigger than "+values.length);
				return;
			}
			else
			{
				values[position]=value;
			}
		}
	}
	public boolean getValueAt(int position)
	{
		return values[position];
			
	}
	
	private boolean illegal(char ch)
	{
		if(ch!='T' && ch!='F')
			return false;
		else
			return true;
	}
}
