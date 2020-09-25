/**
 * 
 */
package exercise10_12;

import examples.Date;

/**
 * @author tboydev
 *
 */
public abstract class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final Date birthDate;
	
	
	//constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, int birthMonth, int birthDay, int birthYear) {

		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		
		this.birthDate = new Date(birthMonth, birthDay, birthYear);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
			return socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %s%nsocial security number: %s%nbirth date: %s", getFirstName(), 
				getLastName(), getSocialSecurityNumber(), getBirthDate());
	}
	
	
	
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	//abstract method must be overridden by concretre subclasses
	public abstract double earnings();
}
