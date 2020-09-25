package exercise8_12;

public class DateAndTime {

	
	private int month;
	private int day;
	private int year;
	
	private int timeInSeconds;
	
	private int hour = timeInSeconds / 3600;
	
	private static final int [] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
	
	public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
		
		if(month <=0 || month > 12)
			throw new IllegalArgumentException("month must be (1-12)");
		
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("day("+ day +") out of range for specified month and day");
		}
		
		if(month == 2 && day == 29 && !((year % 400 == 0) || (year % 4  == 0&& year % 100 != 0)))
			throw new IllegalArgumentException("day("+day+")out of range for the specified month and year");
		
		if(year <= 999 || year > 9999)
			throw new IllegalArgumentException("year("+ year +") out of range ");
		

		this.month = month;
		this.day = day;
		this.year = year;
		
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0 - 23");
		
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0 - 59");
		
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0 - 59");
		
		timeInSeconds = ((hour * 3600) + (minute * 60) + second);
			
	}
	public DateAndTime() {
		this(2, 1, 1999, 00, 59, 59);
	}
	
	public void setTime(int hour, int minute, int second) {
		
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0 - 23");
		
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0 - 59");
		
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0 - 59");
		
		timeInSeconds = ((hour * 3600) + (minute * 60) + second);
		
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
	

	
	public String newTime() {
		hour = incrementHour();
		
	return	String.format("%02d:%02d:%02d%4s", (hour == 24) ? 00 : hour, 
				(incrementMinute() == 60 ) ? 00 : incrementMinute(), 
				(tick()== 60)? 00 : getSecond(), (incrementHour() % 24 <= 11) ? "AM" : "PM" );
	}
	
	
	public String toUniversalString() {
		
		newTime();
		return String.format("Date: %d/%d/%d Time: %02d:%02d:%02d",getMonth(), getDay(), getYear(), getHour(), getMinute(), getSecond());
	}
	
	public String toString() {
		
		return String.format("Time: %d:%02d:%02d: %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), 
				(getMinute() == 60 ? 00 : getMinute()), (getSecond() == 60 ? 00 : getSecond()), 
				(getHour() < 12 ? "AM" : "PM"));
	}
	
	public int tick() {
		
		int seconds = getSecond() + 1;
		
		return seconds;
	}
	
	public int incrementMinute() {
		
		int minute = getMinute() + 1;
		
		return minute;
	}
	
	public int incrementHour() {
		
		int hour = getHour() + 1;
		
		if(hour == 00) {
			nextDay();
		}
		
		return hour;
	}
	
	
	
	public int getHour() {
		
		return timeInSeconds / 3600;
	}
	
	public int getMinute() {
		
		int minute = (getHour() * 3600) ;
		return (timeInSeconds - minute) / 60;
		
	}
	
	public int getSecond() {
		
		int seconds = ((getHour() * 3600) + (getMinute() * 60));
		return timeInSeconds - seconds;
		
	}
	
	public void setHour(int hour) {	
	if(hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0 - 23");
	
	timeInSeconds = (hour * 3600);
	
	}

	public void setMinute(int minute) {

	if(minute < 0 || minute >= 60) {
		throw new IllegalArgumentException("minute must be 0 - 59");
	}
	timeInSeconds = minute * 60;
	}

	public void setSeconds(int second) {
	
	if(second < 0 && second >= 60) {
		throw new IllegalArgumentException("seconds must be 0 - 59");
	}
	timeInSeconds = second;
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
	
	
}
