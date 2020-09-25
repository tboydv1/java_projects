package exercise8_5;

public class Time2 {

//	private int hour;
//	private int minute;
//	private int second;
	private int timeInSeconds;
	
	public Time2() {
		
		this(0, 0, 0); //invoke constructor with three variable and initialize values
		
	}
	
	public Time2(int hour) {
		
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Time2(int hour, int minute, int second) {
		
		if(hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0 -23");
		
		if(minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0- 59");
		
		if(second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0 - 59");
		
		timeInSeconds = ((hour * 3600) + (minute * 60) + second);
		
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
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
	
	public String toUniversalString() {
		
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString() {
		
		return String.format("%d:%02d:%02d: %s",
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
		
		return hour;
		
		
	}
	
	public String newTime() {
		
		
		return	String.format("%02d:%02d:%02d%4s", (incrementHour() == 24) ? 00 : incrementHour(), 
				(incrementMinute() == 60 ) ? 00 : incrementMinute(), 
				(tick()== 60)? 00 : getSecond(), (incrementHour() % 24 <= 11) ? "AM" : "PM" );
	}
	
	
	
	
	
}
