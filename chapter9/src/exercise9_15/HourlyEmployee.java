package exercise9_15;

import exercise9_10.Employee;;

public class HourlyEmployee extends Employee {

	private double hours;
	private double wagePerHour;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
			double hoursWorked, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(hoursWorked < 0 || hoursWorked > 168)
			throw new IllegalArgumentException("Hours worked must be greater that zero");
		
		if(wage < 0)
			throw new IllegalArgumentException("Wage must be great than zero");
		
		this.wagePerHour = wage;
		this.hours = hoursWorked;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		
		if(hours < 0 || hours > 168)
			throw new IllegalArgumentException("Hours worked must be greater that zero");
		
		this.hours = hours;
	}

	public double getWage() {
		return wagePerHour;
	}

	public void setWage(double wage) {
		
		if(wage < 0)
			throw new IllegalArgumentException("Wage must be great than zero");
		
		this.wagePerHour = wage;
	}
	
	public double earnings() {
		
		double  totalEarnings = 0, hours = getHours(), 
		wage = getWage(), extraHours = hours - 40, wageIncrease;
		
		if(hours <= 40) {
			totalEarnings = hours * wage;
		}
		else if(hours > 40 && hours <= 168) {
			wageIncrease = wage * 1.5;
			
			totalEarnings = (hours * wage) + extraHours * wageIncrease;
		}
		
		return totalEarnings;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%sHours worked: %.1f%nHourly wage: %.1f%nTotal earnings: %.2f", super.toString(),
				getHours(), getWage(), earnings());
	}
	
}
