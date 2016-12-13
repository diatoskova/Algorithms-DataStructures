package genericComponents;

import Examples.Person;

public class TestMemoryCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemoryCell m=new MemoryCell();
		//m.write("a");
		String val=(String)m.read();
		System.out.println(val);
	}

}
