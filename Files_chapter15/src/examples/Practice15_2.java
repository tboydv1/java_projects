package examples;

import java.io.IOException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Practice15_2 {

	static Scanner inOldMaster, inTransaction;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Formatter outNewMaster = new Formatter("newmast.txt")){
			 inOldMaster = new Scanner("oldmaster.txt");
			 inTransaction = new Scanner("trans.txt");
			 
			 
	
						
			 Account ent = new Account();
	
			ent.setAccountNumber(inOldMaster.nextInt());
			ent.setFirstName(inOldMaster.next());
	    	ent.setLastName(inOldMaster.next());
	    	ent.setBalance(inOldMaster.nextDouble());
	    	
	    	TransanctionRecord trans = new TransanctionRecord();
			
			trans.setAccount(inTransaction.nextInt());
			trans.setAmount(inTransaction.nextDouble());
			
			outNewMaster.format("%d%s%s%.2f", 
									ent.getAccountNumber(), ent.getFirstName(),
									ent.getLastName(), ent.getBalance()); 
			
		}
		catch(IOException | NoSuchElementException io) {
			
			System.out.println("Error processing file");
			
		}
		finally{
			inOldMaster.close();
			inTransaction.close();
		}
	
	}
	
	
}
