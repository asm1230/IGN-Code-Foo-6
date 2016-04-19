public class Date
{
	private int year;
	private int month [];
	private int day [];
	private int hours;
	private int mins;
	private int sec;
	private int msec;
	private Date date;
	
	final static int January = 1;
	final static int February = 2;
	final static int March = 3;
	final static int April = 4;
	final static int May = 5;
	final static int June = 6;
	final static int July = 7;
	final static int August = 8;
	final static int September = 9;
	final static int October = 10;
	final static int November = 11;
	final static int December = 12;
	
	public Date()
	{
		date = null;
	}
	
	public Date(int year, int month, int day)
	{
		year = 0;
		month = 0;
		day = 0;
	}
	
	public Date(int year, int month, int date, int hours, int mins, int sec)
	{
		year = 0;
		month = 0;
		date = 0;
		hours = 0;
		mins = 0;
		sec = 0;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setMonth(int [] m)
	{
		for(int i = 0; i < 12; i++)
		{
			m [0] = January;
			month [1] = February;
			month [2] = March;
			month [3] = April;
			month [4] = May;
			month [5] = June;
			month [6] = July;
			month [7] = August;
			month [8] = September;
			month [9] =  October;
			month [10] = November;
			month [11] = December;
		} 
	}
	
	public int getMonth(int m)
	{
		return month [m];
	}
	
	public void setDay(int [] d)
	{
		
	}
	
	public static void main(String [] args)
	{
		Date d = new Date();
		d.setYear(1993);
		System.out.println(d.year);
		
	}
}
