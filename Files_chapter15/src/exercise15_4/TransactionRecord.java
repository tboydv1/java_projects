package exercise15_4;

public class TransactionRecord {

	public TransactionRecord(int accountNumber, double amount) {
		
		this.setAccountNumber(accountNumber);
		this.amount = amount;
	}
	
	
	public TransactionRecord() {
		
		this(100, 0.0);
	}

	private int accountNumber;
	
	private double amount;

	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		
		if(validateAccountNumber(accountNumber) == true)
			this.accountNumber = accountNumber;
		else
			throw new IllegalArgumentException("Invalid account number format");
		
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	private static boolean validateAccountNumber(int accountNumber) {
		
		String tempAcc = String.valueOf(accountNumber);
		
		
		if(tempAcc.matches("\\d{3}")) {
			return true;
		}
		else return false;
	}
	
	
}
