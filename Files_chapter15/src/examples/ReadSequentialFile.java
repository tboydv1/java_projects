package examples;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("/home/tobiloba/programming/java_practice/Files_chapter15/clients.ser")))){
			
			readRecords(input);
			
		}
		catch(IOException io)
		{
			System.err.println("Error processing file.");
			System.exit(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid object type. Terminating");
		}
		
		
	}
	public static void readRecords(ObjectInputStream input) throws ClassNotFoundException, IOException
	{
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
		
		try {
			while(true){
				
				Account record = (Account) input.readObject();
				
				System.out.printf("%-10d%-12s%-12s%10.2f%n",
						record.getAccountNumber(), record.getFirstName(),
						record.getLastName(), record.getBalance());
			}
		}
		catch(EOFException endOfFileException)
		{
			System.out.printf("%nNo more records%n");
		}
	}

}
