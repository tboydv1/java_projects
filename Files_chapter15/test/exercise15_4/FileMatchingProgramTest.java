package exercise15_4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FileMatchingProgramTest {

	TransactionRecord transRecord;
	CustomerAccount customer;
	
	FileMatch matcherObj;
	String oldMastFile;
	String transFile;
	String newMastFile;
	
	@BeforeEach
	void setUp() throws Exception {
		
		matcherObj = new FileMatch();
		
	
		transRecord = new TransactionRecord();
		
		
		oldMastFile = "/home/tobiloba/programming/java_project/Files_chapter15/oldmast.txt";
		
		transFile = "/home/tobiloba/programming/java_project/Files_chapter15/trans.txt";
		
		newMastFile = "/home/tobiloba/programming/java_project/Files_chapter15/newmast.txt";
		
		
		System.out.println("Running...");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		
	}
	
	@Test 
	void custmerAccountInitializedTest() {
		
		customer = new CustomerAccount(100, "Johnson", "RoadWork", 75.55);
		
		assertNotNull(customer);
		
		System.out.println(customer.toString());
		
	}

	@Test 
	void  transactionInintializedTest() {
		
		assertNotNull(transRecord);
		
	}
	
	@Test
	void createAccountFileTest() {
		
		createAccountFile("oldmast.txt");
		
		try(Scanner scanRec = new Scanner(Paths.get("/home/tobiloba/programming/java_project/Files_chapter15/oldmast.txt"))){
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(100, customer.getAccountNumber());
			assertEquals("Alan", customer.getFirstName());
			assertEquals("Jones", customer.getLastName());
			assertEquals(344.17, customer.getBalance());
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(300, customer.getAccountNumber());
			assertEquals("Mary", customer.getFirstName());
			assertEquals("Smith", customer.getLastName());
			assertEquals(27.19, customer.getBalance());
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(500, customer.getAccountNumber());
			assertEquals("Sam", customer.getFirstName());
			assertEquals("Sharp", customer.getLastName());
			assertEquals(0.00, customer.getBalance());
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(600, customer.getAccountNumber());
			assertEquals("Mike", customer.getFirstName());
			assertEquals("Succy", customer.getLastName());
			assertEquals(48.44, customer.getBalance());
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(700, customer.getAccountNumber());
			assertEquals("Suzy", customer.getFirstName());
			assertEquals("Green", customer.getLastName());
			assertEquals(-14.22, customer.getBalance());



			
			
		} 
		catch (IOException | InputMismatchException e) {
			
			e.printStackTrace();
		}
		
	}	
	@Test
	void createTransactionFileTest() {
		
		createTransactionFile("trans.txt");
		
	}
	
	
	
	void createTransactionFile(String fileName) {
		
		try (Formatter formatObj = new Formatter(fileName)){
			
				
			try (Scanner input = new Scanner(Paths.get("/home/tobiloba/programming/java_project/Files_chapter15/tempTrans.txt"))){
				
//				formatObj.format("%-11s%13s%n%-5s%10s%n", "Transaction File", "Transaction", "account number" , "amount");
				
//				System.out.printf("Enter account number, amount%n%s%n%s",
//						"Enter end-of-file indicator to end input.","?");
				
				while(input.hasNext()) {
					
					formatObj.format("%-18d%-10.2f%n", input.nextInt(),
							input.nextDouble());
					
					
					
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element exception");
			}
		}
		catch(IOException ie) {
			System.err.println("File not found");
		}
		catch(FormatterClosedException fce) {
			System.err.println("FormaterClosed");
			
		}
		catch (SecurityException e) {
			
			System.err.println("Error creating file");
			
		}	
		
	}
	
	void createAccountFile(String fileName) {
		
		try (Formatter formatObj = new Formatter(fileName)){
			
			
			try (Scanner input = new Scanner(Paths.get("/home/tobiloba/programming/java_project/Files_chapter15/account.txt"))){
				
//				formatObj.format("Master file%n%-18s%-18s%-12s%n", "account number", "Name", "Balance");
				
//				System.out.printf("Enter account number, first name, last name and balance.%n%s%n%s",
//						"Enter end-of-file indicator to end input.", "?");
				
				while(input.hasNext()) {
					
					formatObj.format("%-18d%-8s%-10s%-10.2f%n", input.nextInt(),
							input.next(),input.next(), input.nextDouble());
					
				}
			}
			catch(NoSuchElementException e) {
				System.out.println("No such element exception");
			}
			catch(IOException e) {
				
				System.err.println("Error reading from file");
			}
			
			
		} 
		
		catch(FileNotFoundException fe) {
			System.err.println("File not found");
		}
		catch(FormatterClosedException fce) {
			System.err.println("FormaterClosed");
			
		}
		catch (SecurityException e) {
			
			e.printStackTrace();
			System.err.println("Error creating file");
			
		}
		
	}
	
	@Test
	void createNewMastFileTest() {
	
		
		matcherObj.createNewMastFile(oldMastFile, transFile);
		
		try(Scanner scanRec = new Scanner(Paths.get("/home/tobiloba/programming/java_project/Files_chapter15/newmast.txt"))){
			
			customer = new CustomerAccount (scanRec.nextInt(), scanRec.next(), scanRec.next(),scanRec.nextDouble());
			
			assertEquals(100, customer.getAccountNumber());
			assertEquals("Alan", customer.getFirstName());
			assertEquals("Jones", customer.getLastName());
			assertEquals((371.31), customer.getBalance());
		
		
		
		}
		catch(IOException io) {
			
			System.err.println("Read file error");
			System.exit(1);
			
		}
	}
	
	
}
