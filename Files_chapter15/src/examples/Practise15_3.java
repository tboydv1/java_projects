package examples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Practise15_3 {

	public static void main(String... args) {
		
		
		try{
			
			ObjectInputStream inOldMaster = new ObjectInputStream(Files.newInputStream(Paths.get("oldermaster.ser")));
			ObjectInputStream inTransaction = new ObjectInputStream(Files.newInputStream(Paths.get("trans.ser")));
			ObjectOutputStream outNewMaster = new ObjectOutputStream(Files.newOutputStream(Paths.get("newmast.ser")));
			
			Account accountRecord = (Account) inOldMaster.readObject();
			TransanctionRecord transRecord = (TransanctionRecord) inTransaction.readObject();
			
			outNewMaster.writeObject(accountRecord);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
