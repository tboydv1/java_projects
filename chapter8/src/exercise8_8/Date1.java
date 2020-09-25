package exercise8_8;

public class Date1 {

	
	private int month; 
	private int day;
	private int year;
	
	private static final int [] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
	
	public Date1(int month, int day, int year)
	{
		//validate month
		if(month <=0 || month > 12) {
			 throw new IllegalArgumentException("month ("+ month +") must be 1-12");
			 
		}
		
		//validate day
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specified month and year");
		
		if(year <= 999 || year >  9999)
			throw new IllegalArgumentException("year ("+ year +") year out-of-range");
		
		
		if(month == 2 && day  == 29 && !(  (year % 400 == 0)   || (year % 4 == 0 && year % 100 != 0)  ))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public void setDate(int month, int day, int year) {
		if(month <=0 || month > 12) {
			 throw new IllegalArgumentException("month ("+ month +") must be 1-12");
			 
		}
		
		//validate day
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specified month and year");
		
		if(year <= 999 || year >  9999)
			throw new IllegalArgumentException("year ("+ year +") year out-of-range");
		
		
		if(month == 2 && day  == 29 && !(  (year % 400 == 0)   || (year % 4 == 0 && year % 100 != 0)  ))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		
	}
	
	public void nextDay() {
		
		
		if(getDay() < daysPerMonth[month]) {
			day++;
		}
		else if(getDay() <= daysPerMonth[month]){
			
			day = 1;
			month++;
		}
		
		if(getMonth() > 12) {
			year++;
			month = 1;
		}
		
			
	}
	
	public String toString() {
		
		return String.format("%d/%d/%d", month, day, year);
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public static int getDaysPerMonth(int month) {
		return daysPerMonth[month];
	}
}
