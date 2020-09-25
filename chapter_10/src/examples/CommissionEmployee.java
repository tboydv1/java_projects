/**
 * 
 */
package examples;

/**
 * @author tboydev
 *
 */
public class CommissionEmployee extends Employee {

	/**
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 */
	
	
	private double grossSales; // gross weekly sales
	private double commissionRate;
	
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate)
	{
		
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commision rate must be > 0.0 and < 1.0");
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	

	public double getGrossSales() {
		return grossSales;
	}



	public void setGrossSales(double grossSales) {
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		
		this.grossSales = grossSales;
	}



	public double getCommissionRate() {
		return commissionRate;
	}



	public void setCommissionRate(double commissionRate) {
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commision rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getCommissionRate() * getGrossSales();
	
	}
	
	@Override
	public String toString() {
		
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
	
	@Override
	public double getPayMentAmount() {
		
		return getCommissionRate() * getGrossSales();
		
	}

}
