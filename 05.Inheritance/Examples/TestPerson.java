package Examples;

public class TestPerson {

	public static void main(String[] args) {

		Student s=new Student("Joe",21,"Pfeilgasse 1a", "0886 865 456",4.6);
		
		Person p=s;
		System.out.println("The age of "+p.getName()+" is: "+p.getAge());
		
		Student s2=new Student("Ann",23,"ad 2","45453423",5.0);
		
		System.out.println(Student.isOlder(s, s2));
		
		
		Person[] people=new Person[4];
		
		people[0]=new Person("Didi", 25, "Address 1", "Phone 1");
		people[1]=new Student("Max", 19, "fjsoks", "12345", 2.0);
		people[3]=new Employee("John", 35,"fsfsfsfs", "4566778", 2050);
		
		if(people[3] instanceof Employee)
			((Employee)people[3]).raise(0.04);
		
		Person.printAll(people);
		System.out.println("findMax: "+Person.getMax(people).getName());
	}

}
