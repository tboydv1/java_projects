package examples;

public class TransanctionRecord {

	int account;
	
	double amount;

	public TransanctionRecord(int account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}
	
	public TransanctionRecord() {
		
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
