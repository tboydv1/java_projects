package examples;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateSequentialFile {
	
	public static void main(String[] args) {
		
		try(ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")))){
			
			addRecords(output);
			
			if(output != null)
				output.close();
			
		}
		catch(IOException exception)
		{
			System.err.println("File processing error. Terminating.");
			System.exit(1);
		}
	}
	public static void addRecords(ObjectOutputStream output) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n? ", 
				"Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		
		while(input.hasNext())
		{
			try
			{
				Account record = new Account(input.nextInt(), input.next(),
						input.next(),  input.nextDouble());
				
				//serialize record object into file
				output.writeObject(record);
				
			}
			catch(NoSuchElementException elementException)
			{
				System.err.println("Invalid input. Please try again");
				input.nextLine(); //discard input so user can try again
			}
			System.out.print("?");
		}
		input.close();
	}
	
}
