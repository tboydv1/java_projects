/**
 * 
 */
package examples;

/**
 * @author tboydev
 *
 */
public class SalariedEmployee extends Employee {

	
	private double weeklySalary;
	
	//Constructor
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	
	
	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		
		if(weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}

	//calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(),
				"weekly salary", getWeeklySalary());
	}
	
	@Override
	public double getPayMentAmount() {
		
		return getWeeklySalary();
		
	}

}
