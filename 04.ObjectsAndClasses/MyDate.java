package Examples;

public class MyDate {
	public static int[] daysTillFirstOfMonth;
	
	static 
	{
		int days = 0;
		
		
		daysTillFirstOfMonth=new int[12];
		
		for(int i=1;i<=12;i++)
		{
			
			daysTillFirstOfMonth[i-1]=days;
			
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
			{
				days+=31;
			}
			else if(i==2)
			{
				days+=28;
			}
			else
			{
				days+=30;
			}
		}
	}
	
	public static int[] daysTillJan1;
	
	static 
	{
		int days=0;
		daysTillJan1=new int[701];
		
		for(int i=1800;i<=2500;i++)
		{
			daysTillJan1[i-1800]=days;
			
			if(!leap(i))
			{
				days+=365;
			}
			else
			{
				days+=366;
			}
		}
	}
	
	private int date;
	
	public MyDate(int year,int month,int day)
	{
		if(error(year,month,day))
		{
			throw new IllegalArgumentException("The date that you`ve entered is incorrect.");
		}
		
		this.date=day+daysTillFirstOfMonth[month-1]+daysTillJan1[year-1800];
	}
	
	public MyDate(int date)
	{
		if(date<1 || date>daysTillJan1[daysTillJan1.length-1]+365)
		{
			throw new IllegalArgumentException("The date that you`ve entered is incorrect.");
		}
		
		this.date=date;
	}
	//checks if the date is correct
	public static boolean error(int year,int month,int day)
	{
		if(year<1800 || year>2500)
		{
			return true;
		}
		
		if(month<1 || month>12)
		{
			return true;
		}
		
		if(month==1 || month==3 || month==5 || 
		   month==7 || month==8 || month==10 || month==12)
		{
			if(day<1 || day>31)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			if(day<1 || day>30)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(leap(year))
			{
				if(day<1 || day>29)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				if(day<1 || day>28)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
	}
	
	public static boolean leap(int year)
	{
		if(year%400==0)
			return true;
		if(year%100==0)
			return false;
		if(year%4==0)
			return true;
		return false;
	}

	public int num()
	{
		return this.date;
	}

	public String toString()
	{
		int year=1800;
		int month=0;
		int day=0;
		
		for(int i=1800;i<2500;i++)
		{
			if(this.date>=daysTillJan1[i-1800] && this.date<daysTillJan1[i-1800+1])
			{
				year=i;
				break;
			}
			if(i>=daysTillJan1[daysTillJan1.length-1])
			{
				year=2500;
				break;
			}
			
		}
		int daysThisYear=this.date-daysTillJan1[year-1800];
		
		for(int i=1;i<12;i++)
		{
			if(daysThisYear>=daysTillFirstOfMonth[i-1] && 
			   daysThisYear<daysTillFirstOfMonth[i])
			{
				month=i;
				break;
			}
			if(i>=daysTillFirstOfMonth[daysTillFirstOfMonth.length-1])
			{
				month=12;
				break;
			}
		}
		day=daysThisYear-daysTillFirstOfMonth[month-1];
		
		return day+"."+month+"."+year;
	}

	public static int substract(MyDate d1,MyDate d2)
	{
		int result=d1.date-d2.date;
		if(result<0)
			result=0-result;
		return result;
	}
	
	public void increment(int days)
	{
		if(date+days>daysTillJan1[daysTillJan1.length-1]+365)
		{
			throw new IllegalArgumentException("cannot add since date will exceed the allowed.");
		}
		
		this.date+=days;
	}
	
	public boolean equals(MyDate someDate)
	{
		if(this.date==someDate.date)
			return true;
		else
			return false;
	}
	public int compareTo(MyDate someDate)
	{
		if(this.date<someDate.date)
			return -1;
		else if(this.date==someDate.date)
			return 0;
		else
			return 1;
	}
}
