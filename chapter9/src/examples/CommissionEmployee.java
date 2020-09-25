package examples;

public class CommissionEmployee extends Object{

	
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
	{
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales nust be greater or equal 0.0");
		}
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0 ");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public double earnings() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		
		
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee",
				firstName, lastName, "social security number", socialSecurityNumber, 
				"gross sale", grossSales, "commission rate", commissionRate);
		
		
		
		
		
	}
	
	
}
