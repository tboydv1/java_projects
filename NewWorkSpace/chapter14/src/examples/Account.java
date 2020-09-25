package examples;

public class Account {

	private String firstName;
	private String lastName;
	
	
	public Account(String name1, String name2) {
		
		firstName = name1;
		lastName = name2;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		
	String fullName = getFirstName() +" "+ getLastName();
		return String.format(fullName);
	}
	
}
