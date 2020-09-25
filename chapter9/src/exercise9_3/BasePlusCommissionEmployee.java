package exercise9_3;
import examples.CommissionEmployee;
/**(Using Composition Rather Than Inheritance) Many programs written with inheritance
could be written with composition instead, and vice versa. Rewrite class BasePlusCommissionEmployee (Fig. 9.11) of the CommissionEmployee–BasePlusCommissionEmployee hierarchy to use
composition rather than inheritance.
 * 
 * @author tboydev
 *
 */
public class BasePlusCommissionEmployee {
	
	CommissionEmployee employee1;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(CommissionEmployee employee1, double baseSalary) {
		
		this.employee1 = employee1;
		
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
	
	public double earnings() {
		
		return getBaseSalary() + employee1.earnings();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %s%n%s: %.2f", "base-salaries",
				employee1.toString(), "base salary", getBaseSalary());
	}
	
}
