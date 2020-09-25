/**
 * 
 */
package examples;

/**
 * @author tboydev
 *
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

	/**
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commissionRate
	 */
	private double baseSalary;
	
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
//	@Override
//	public double earnings() {
//		
//		return super.earnings() + getBaseSalary();
//		
//		
//	}
//	
	
	@Override
	public String toString() {
		
		return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", this.getBaseSalary());
		
	}
	
	 
	

}
