package Examples;

public class Student extends Person {

	private double gpa;
	
	public Student(String name,int age,String address, String phone, double g)
	{
		super(name,age,address,phone);
		this.gpa=g;
	}
	public double getGpa()
	{
		return this.gpa;
	}
	
	public String toString()
	{
		return super.toString()+", "+getGpa();
	}
	
	public static boolean isOlder(Person p1, Person p2)
	{
		return p1.getAge()>p2.getAge();
	}
}
