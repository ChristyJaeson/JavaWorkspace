package SID13025.Lab2;



public class Date {
	int year,month,day;
	int maxDay[][]={{1,2,3,4,5,6,7,8,9,10,11,12},
					{31,28,31,30,31,30,31,31,30,31,30,31}};
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	Date(int a,int b,int c )
	{
		day=a;
		month=b;
		year=c;
	}
	/*Date( )
	{
		java.util.Date d= new java.util.Date();
		day=d.getDay();
		month=d.getMonth();
		year=d.getYear();
		
	}*/
	void changeToNextDay()
	{
		if(day+1> maxDay[1][month-1])
		{
			if(isLeapYear()){
				if(month==2)
					if(day==maxDay[1][1])
						day++;
			}
			else
			{
			day=1;
			month++;
			}
		}
		else
			day++;
		if(month>12)
		{
			year++;
			month=1;
		}
		
	}
	boolean isNewYearEve()
	{
		if(day==1 && month==1)
			return true;
		else
			return false;
	}
	boolean isLeapYear()
	{
		if(year%4==0)
			return true;
		else
		return false;
		
	}
	String print()
	{
		return day+"/"+month+"/"+year;
	}
	public static void main(String args[])
	{
		Date today=new Date(31,12,1994);
		System.out.println(today.print());
		Date tommorrow=new Date(28,2,1996);
		Date t=new Date(28,2,1995);
		today.changeToNextDay();
		System.out.println(today.print());
		tommorrow.changeToNextDay();
		t.changeToNextDay();
		System.out.println(t.print());
		System.out.println(today.print()+" is NewYear : "+today.isNewYearEve());
		System.out.println(today.print()+" is LeapYear : "+today.isLeapYear());
		System.out.println(tommorrow.print()+" is NewYear : "+tommorrow.isNewYearEve());
		System.out.println(tommorrow.print()+" is LeapYear : "+tommorrow.isLeapYear());
		
		//Date tommorrow=new Date();
	}
}
