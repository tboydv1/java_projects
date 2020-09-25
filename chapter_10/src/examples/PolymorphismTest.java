/**
 * 
 */
package examples;
import examples.*;
/**
 * @author tboydev
 *
 */
public class PolymorphismTest {

	public static void main(String args[]) {
		
		//assign super class reference to superclass variable
		CommissionEmployee2 commissionEmployee = new CommissionEmployee2("Sue","Jones","222-22-2222", 10000, .06);
		
		//assign subclass reference to subclass variable
		BasePlusCommissionEmployee2 basePlusCommissionEmployee = new BasePlusCommissionEmployee2("Bob",
				"Lewis","333-333-3333", 5000, .04,300);
		
		//invoke toString on superclass object using superclass variable
		System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ", 
				"to superclass object", commissionEmployee.toString());
		
		//invoke toString on subclass object using subclass variable
		System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass reference ", 
				"to subclass object", basePlusCommissionEmployee.toString());
		
		//invoke toString on subclass object using superclass variable
		CommissionEmployee2 commissionEmployee2 = basePlusCommissionEmployee;
		
		System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee's toString with superclass reference ", 
				"to subclass object", commissionEmployee2.toString());
		
	}
}
