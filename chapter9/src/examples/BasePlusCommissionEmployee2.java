package examples;

public class BasePlusCommissionEmployee2 extends CommissionEmployee2 {

	private double baseSalary;
	
	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		
		return getBaseSalary() + super.earnings();
		
	}
	@Override
	public String toString() {
		
		
		return String.format("%s %s%n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	}
	
	
	

}
