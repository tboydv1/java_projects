package exercise15_4;

public class CustomerAccount {

	private int accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	
	public CustomerAccount(int accNum, String nameF, String nameL, double bal) {
		
		if(validateAccountNumber(accNum) == false)
			throw new IllegalArgumentException("Invalid account format");
		
		this.accountNumber = accNum;
		
		this.setFirstName(nameF);
		
		this.setLastName(nameL);
		
		this.balance = bal;
		
		
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		
		if(validateAccountNumber(accountNumber) == true)
			this.accountNumber = accountNumber;
		else
			throw new IllegalArgumentException("Invalid account number format");
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		if(firstName.matches("[A-Za-z]+"))
			this.firstName = firstName;
		else
			throw new IllegalArgumentException("Invalid firstName format");
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		
		if(lastName.matches("[A-Za-z]+"))
			this.lastName = lastName;
		else
			throw new IllegalArgumentException("Invalid firstName format");
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double combine(TransactionRecord transRecord) {
		
		if (transRecord.getAmount() < 0)
			return getBalance() - transRecord.getAmount();
		else 
			return getBalance() + transRecord.getAmount();
		
	}
	
	
	private static boolean validateAccountNumber(int accountNumber) {
		
		String tempAcc = String.valueOf(accountNumber);
		
		
		
		
		if(tempAcc.matches("\\d{3}")) {
			
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public String toString() {
		
		return String.format("%d%n%s%n%s%n%.2f", getAccountNumber(), getFirstName(), getLastName(), getBalance());
	}
	
	
}
