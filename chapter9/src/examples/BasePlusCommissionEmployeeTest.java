package examples;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasePlusCommissionEmployee baseEmployee = new BasePlusCommissionEmployee("John", "Dalton", "55-555-45434", 5000, .04, 300);
		
		System.out.println("Employee information obtained by get methods: ");
		System.out.printf("%n%s %s%n", "First name is", baseEmployee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", baseEmployee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", baseEmployee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is", baseEmployee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is", baseEmployee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is", baseEmployee.getBaseSalary());
		
		baseEmployee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",
			baseEmployee.toString());
	}

}
