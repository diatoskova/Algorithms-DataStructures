package Examples;

/**
 * A class for simulating an integer memory cell
 * @author Diana Toskova
 */
public class IntCell {

	
	private int storedValue;
	
	/**
	 * Get the stored value.
	 * @return the stored value.
	 */
	public int read(){
		return storedValue;
	}
	
	/**
	 * Store a value.
	 * @param x the number to store.
	 */
	public void write(int x){
		storedValue=x;
	}
}
