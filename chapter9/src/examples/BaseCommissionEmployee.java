package examples;

public class BaseCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	public BaseCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate,
			double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
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
		// TODO Auto-generated method stub
		
		return baseSalary * (grossSales + commissionRate);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format(
				"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"base-salaried commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate,
				"base salary", baseSalary);
	}
	
	
	
	
}
