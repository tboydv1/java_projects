package examples;

public class Date {

	private int month; 
	private int day;
	private int year;
	
	private static final int [] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
	
	public Date(int month, int day, int year)
	{
		//validate month
		if(month <=0 || month > 12) {
			 throw new IllegalArgumentException("month ("+ month +") must be 1-12");
			 
		}
		
		//validate day
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specified month and year");
		
		
		if(month == 2 && day  == 29 && !(year % 400 == 0 || 
				(year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");
		
		this.month = month;
		this.day = day;
		this.year = year;
		
//		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public String toString() {
		
		return String.format("%d/%d/%d", month, day, year);
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
	
