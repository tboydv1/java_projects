package examples;

public class Employee2 {
	
	private static int count = 0; //number of employees
	private String firstName;
	private String lastName;
	
	public Employee2(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // increment static count of employees
		System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getlastName() {
		
		return lastName;
	}
	
	public static int getCount() {
		
		return count;
	}
}
