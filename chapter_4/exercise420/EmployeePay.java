package chapter4.exercise420;

public class EmployeePay {
	
	private int hourlyRate;
	private int hoursWorked;
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double calculateGrossPay()
	{
		double grossPay = 0;
		int extraHours;
		if(hoursWorked <= 40)
		{
			grossPay = hoursWorked * hourlyRate;
		}
		if (hoursWorked > 40)
		{
			extraHours = hoursWorked - 40;
			grossPay = (extraHours + (extraHours / 2) + 40) * hourlyRate;
		}
		return grossPay;
	}

}
