/**
 * 
 */
package examples;

/**
 * @author tboydev
 *
 */
public class PayRollSystemTest {

	public static void main(String args[]) {
		
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee("Sue", "Jones", "333-33-3333", 1000, 0.6);
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
//		System.out.println("Employees processes individually: ");
//		
//		System.out.printf("%n%s%n%s: $%,.2f%n%n", 
//				salariedEmployee, "earned", salariedEmployee.earnings());
//		
//		
//		System.out.printf("%n%s%n%s: $%,.2f%n%n", 
//				hourlyEmployee, "earned", hourlyEmployee.earnings());
//		
//		System.out.printf("%n%s%n%s: $%,.2f%n%n", 
//				commissionEmployee, "earned", commissionEmployee.earnings());
//		
//		System.out.printf("%n%s%n%s: $%,.2f%n%n", 
//		
//				basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		
		
		Employee[] employees = new Employee[4];
		
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		for(Employee currentEmployee: employees)
		{
			System.out.println(currentEmployee); //invokes toString

			//determine whether element is a BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee)
			{
				
				BasePlusCommissionEmployee employee = 
						(BasePlusCommissionEmployee) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}
			
//			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			
			
		}
		
		for(int i = 0; i < employees.length; i++)
			System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
		
	}
}
