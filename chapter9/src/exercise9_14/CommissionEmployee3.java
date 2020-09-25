package exercise9_14;

import exercise9_10.Employee;

public class CommissionEmployee3 extends Employee {
	
	protected double grossSales;
	protected double commissionRate;

	public CommissionEmployee3(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales nust be greater or equal 0.0");
		}
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0 ");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	
	

	public double getGrossSales() {
		
		
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales nust be greater or equal 0.0");
		}
		
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0 ");
		
		this.commissionRate = commissionRate;
	}

	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		
		
		return String.format("%s%s: %.2f%n%s: %.2f", super.toString(),
				"gross sale", getGrossSales(), "commission rate", getCommissionRate());
		
		
		
		
		
	}
	

}
