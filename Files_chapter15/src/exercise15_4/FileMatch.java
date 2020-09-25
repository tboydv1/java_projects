package exercise15_4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatch {
	
	CustomerAccount customer;
	
	TransactionRecord transRecord;
	
	
	public void createNewMastFile(String mastFile, String transFile) {
		
		
		
		try (Formatter inNewMaster = new Formatter("newmast.txt"); 
				Scanner scanRec = new Scanner(Paths.get(mastFile));
				Scanner scanTran = new Scanner(Paths.get(transFile))){
			
			
			while(scanTran.hasNext()) {	
				
				customer = new CustomerAccount(scanRec.nextInt(), scanRec.next(),
						scanRec.next(), scanRec.nextDouble());
				
				transRecord = new TransactionRecord(scanTran.nextInt(), scanTran.nextDouble());
				
				
					if(customer.getAccountNumber() == transRecord.getAccountNumber()) {
							
						inNewMaster.format("%-18d%-8s%-10s%-10.2f%n", customer.getAccountNumber(),
								customer.getFirstName(), customer.getLastName(), 
								(customer.combine(transRecord)));
						
					}
					else if(customer.getAccountNumber() != transRecord.getAccountNumber()){
						
						inNewMaster.format("%-18d%-8s%-10s%-10.2f%n", customer.getAccountNumber(),
								customer.getFirstName(), customer.getLastName(), 
								customer.getBalance());
						
					}
					
					if(transRecord.getAccountNumber() != customer.getAccountNumber()) {
						
						
						try(Formatter logFile = new Formatter("log.txt")){
							
							logFile.format("%s %d", "Unmatched transaction record for account number", transRecord.getAccountNumber());
						}
						
					}
			}
			
			
		}
		catch(IOException | NoSuchElementException | SecurityException e){
			
			e.printStackTrace();
			System.out.println("File processing error");
			System.exit(1);
		
		}
		
	}
}
