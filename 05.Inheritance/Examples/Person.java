package Examples;

public class Person {

	private String name;
	private int age;
	private String address;
	private String phone;
	
	public Person(String n,int ag,String ad, String p)
	{
		this.name=n;
		this.age=ag;
		this.address=ad;
		this.phone=p;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
	public void setAddress(String newAddress)
	{
		this.address=newAddress;
	}
	
	public void setPhone(String newPhone)
	{
		this.phone=newPhone;
	}
	
	public String toString()
	{
		return this.getName()+", "+this.getAge()+", "+
		       this.getAddress()+", "+this.getPhone();
	}
	
	public static void printAll(Person[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!= null)
			{
				System.out.print("["+i+"] ");
				System.out.println(arr[i].toString());
			}
		}
	}

	public static Person getMax(Person[] people)
	{
		if(people.length!=0)
		{
			int maxIndex=0;
			
			for(int i=0;i<people.length;i++)
			{
				if(people[i]!=null && people[i].name.compareTo(people[maxIndex].name)>0)
				{
					maxIndex=i;
				}
			}
			return people[maxIndex];
		}
		
		return null;
	}

}
