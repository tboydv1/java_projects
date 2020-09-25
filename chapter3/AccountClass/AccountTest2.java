//This Program makes use of class Account to display initialized name 

import java.util.Scanner;
	public class AccountTest2 {

//main method
		public static void main(String[] args){

//create two account objects and initialize parameters
Account account1 = new Account("Dami Drevid", 50.0);
Account account2 = new Account("Emmanuel Dada", -80.0);

//Display initialized parameters for account objects
	//System.out.printf("%s balance is: %.2f%n",  account1.getName(),	 account1.getBalance());

	displayAccount(account1,account2); //Static method to display accounts

	//System.out.printf("%s balance is: %.2f%n", account2.getName(), account2.getBalance());

	Scanner set = new Scanner(System.in);

//Update account1 initial balance 
		System.out.println();
	System.out.print("Please input deposit amount for account1: ");//prompt use to input deposit amount
		double money = set.nextDouble();
//set account1 to new balance 
	account1.setBalance(money);

//Display new account balance
	System.out.printf("%s Your New Balance is: %.2f%n", account1.getName(), account1.getBalance()); //New Balance
	
		System.out.println();
//Update initial account balance for account2

	System.out.print("Please input deposit amount for account2: ");
		double money2 = set.nextDouble();
//set account2 to new balance
	account2.setBalance(money2);

//Display Updated Amount
	System.out.printf("%s Your New Balance is: %.2f%n", account2.getName(), account2.getBalance());//New Balance
		System.out.println();
//Display balance for account 1 and 2
	displayAccount(account1, account2);
			System.out.println();
	//Withdraw for account1
	System.out.printf("Enter withdraw Amount for %s : ", account1.getName());
			double draw = set.nextDouble();
			//set withdraw amount
		account1.withdraw(draw);
		System.out.println();
		
		
		//System.out.printf("%s new balance is: %.2f%n", account1.getName(), account1.getBalance());
		
			
			
  } 
	  public static void displayAccount(Account account1,Account account2)
	  {
		
	System.out.printf("%s balance is: %.2f%n",  account1.getName(),	 account1.getBalance());

	System.out.printf("%s balance is: %.2f%n", account2.getName(), account2.getBalance());
	  }
}