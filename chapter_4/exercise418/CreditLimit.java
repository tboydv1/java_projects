/**
 * 
 */
package chapter4.exercise418;

/**
 * @author Oluwatobi
 *
 */
public class CreditLimit {
	private int accountNumber;
	private int beginingBalance;
	private int totalItemsCharged;
	private int totalCreditsApplied;
	private int creditLimit;
	private int newBalance;
	

	
	/**
	 * @param accountNumber
	 * @param beginingBalance
	 * @param totalItemsCharged
	 * @param totalCreditsApplied
	 * @param creditLimit
	 */
	public CreditLimit(int accountNumber, int beginingBalance, int totalItemsCharged, int totalCreditsApplied,
			int creditLimit) {
		
		this.accountNumber = accountNumber;
		this.beginingBalance = beginingBalance;
		this.totalItemsCharged = totalItemsCharged;
		this.totalCreditsApplied = totalCreditsApplied;
		this.creditLimit = creditLimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBeginingBalance() {
		return beginingBalance;
	}
	public void setBeginingBalance(int beginingBalance) {
		this.beginingBalance = beginingBalance;
	}
	public int getTotalItemsCharged() {
		return totalItemsCharged;
	}
	public void setTotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}
	public int getTotalCreditsApplied() {
		return totalCreditsApplied;
	}
	public void setTotalCreditsApplied(int totalCreditsApplied) {
		this.totalCreditsApplied = totalCreditsApplied;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int calculateNewBalance()
	{
		newBalance = beginingBalance + totalItemsCharged - totalCreditsApplied;
		return newBalance;
	}
	public void checkCreditLimit()
	{
		if(newBalance > creditLimit)
			System.out.print("Credit Limit Exceeded");
	}
	
}
