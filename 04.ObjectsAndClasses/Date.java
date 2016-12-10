package Examples;

public class Date {

	private int month;
	private int year;
	private int day;
	
	public Date(){
		month=1;
		day=1;
		year=2010;
	}
	
	public Date(int theDay,int theMonth,int theYear){
		day=theDay;
		month=theMonth;
		year=theYear;
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Date)){
			return false;
		}
		
		Date date=(Date)o;
		
		return (date.day==day && 
				date.month==month && 
				date.year==year);
	}
	
	public String toString(){
		return (day+"/"+month+"/"+year);
	}
}
