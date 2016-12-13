package genericComponents;

public class MemoryCell implements Comparable<MemoryCell>{

	private Comparable storedValue;
	
	public Comparable read()
	{
		return this.storedValue;
	}
	
	public void write(Comparable<MemoryCell> o)
	{
		storedValue=o;
	}

	@Override
	public int compareTo(MemoryCell o) {
		return ((storedValue).compareTo(o.storedValue));
	}
}
