package examples;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
	
	static PrintStream myPrint;
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		myPrint = new PrintStream("Running alt test");
		
		printStreamer(myPrint);
	}
	
	public static void printStreamer(PrintStream myPrint) {
		
		
		myPrint.println("Testing the stream");
	}

}
