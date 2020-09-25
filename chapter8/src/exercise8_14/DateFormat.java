package exercise8_14;

public class DateFormat {

	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
	private static final String[] monthPerYear = {"","January","Febuary","March","April","May","June","July",
			"August","September", "October", "November", "December"};
	
	
	
	public DateFormat(int month, int day, int year) {
		
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException("Month("+ month +")is out of range for specified year");
		}
		
		if((day < 0 || day > daysPerMonth[month]) && !(month == 2 && day == 29)) {
			throw new IllegalArgumentException("day ("+day+") out of range for specified month");
		}
		
		if(month == 2 && day  == 29 && !(  (year % 400 == 0)   || (year % 4 == 0 && year % 100 != 0)  ))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");
		
		if(year < 999 || year > 9999) {
			throw new IllegalArgumentException("Year ("+year+") out of range");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public DateFormat(String month, int day, int year) {
		
		int monthIndex = getMonthIndex(month);
		if(monthIndex == 0)
			throw new IllegalArgumentException("Invalid month argumnent");
		
		if((day < 0 || day > daysPerMonth[monthIndex]) && !(monthIndex == 2 && day == 29)) {
			throw new IllegalArgumentException("day ("+day+") out of range for specified month");
		}
		
		if(monthIndex == 2 && day  == 29 && !(  (year % 400 == 0)   || (year % 4 == 0 && year % 100 != 0)  ))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");
		
		if(year < 999 || year > 9999) {
			throw new IllegalArgumentException("Year ("+year+") out of range");
		}
		
		this.month = monthIndex;
		this.day = day;
		this.year = year;
		 
	}
	
	public DateFormat(int day, int year) {
		
		
	
		if(day<= 0 || day > 366)
			throw new IllegalArgumentException("day out of range for specified year");
		
		
		if(year < 999 || year > 9999) {
			throw new IllegalArgumentException("Year ("+year+") out of range");
		}
		
		int month;
		for(month = 1; month < daysPerMonth.length; month++) {
			
			if(day > 31) {
				
				day = day - daysPerMonth[month];
			}
			else {
				
				break;
			}
			
		}
		
		
		if((day < 0 || day > daysPerMonth[month]) && !(month == 2 && day == 29)) {
			throw new IllegalArgumentException("day ("+day+") out of range for specified month");
		}
		
		if(month == 2 && day  == 29 && !(  (year % 400 == 0)   || (year % 4 == 0 && year % 100 != 0)  ))
			throw new IllegalArgumentException("day ("+ day +") out-of-range for the specifies month and year");

		
		this.day = day;
		this.month = month ;
		this.year = year;
		
		
	}
	
	public int getMonthIndex(String month) {
		for(int count = 1; count <= 12; count++) {
			
			if(month.equals(monthPerYear[count]) == true)
				return count;
			
		}
		return 0;
		
	}
	
	public String toString() {
		int numberOfDays = day;
		
		for(int count= 1; count < month; count++) {
			numberOfDays += daysPerMonth[count];
		}
		
		
		return String.format(" Date Formats%n MM DD YYYY - %02d/ %02d/ %4d.%n Month DD YYYY - %8s,%02d,%04d.%n DDD YYYY - %03d/ %4d",
				month, day, year, monthPerYear[month], day, year,numberOfDays , year);
	}
	
	
	
	
}
 