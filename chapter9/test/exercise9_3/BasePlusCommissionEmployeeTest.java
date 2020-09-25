/**
 * 
 */
package exercise9_3;
import examples.CommissionEmployee;
/**
 * @author tboydev
 *
 */
public class BasePlusCommissionEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CommissionEmployee attendant = new CommissionEmployee("Byron", "Cage", "444-33-2224", 6350, 0.5);
		
		BasePlusCommissionEmployee attendant1 = new BasePlusCommissionEmployee(attendant, 100.0);
		
		System.out.println("Employee information obtained by get methods: ");
		System.out.printf("%n%s %s%n", "First name is", attendant.getFirstName());
		System.out.printf("%s %s%n", "Last name is", attendant.getLastName());
		System.out.printf("%s %s%n", "Social security number is", attendant.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", attendant.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", attendant.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", attendant1.getBaseSalary());
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",
				attendant1.toString());
	}

}
