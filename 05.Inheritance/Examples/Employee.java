package Examples;

public class Employee extends Person{

	private double salary;
	
	public Employee(String name, int age, String address, String phone, double salary)
	{
		super(name,age,address,phone);
		this.salary=salary;
	}
	
	public String toString()
	{
		return super.toString()+", "+getSalary();
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public void raise(double percentRaise)
	{
		this.salary*=(1+percentRaise);
	}
}
