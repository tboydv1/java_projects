/**
 * 
 */
package examples;

/**
 * @author tboydev
 *
 */
public class PayableInterfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//create four-element payable array
		Payable[] payableObjects = new Payable[4];
		
		//populate array with objects that implement payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		
		payableObjects[2] = 
				new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = 
				new SalariedEmployee ("Lisa", "Barnes", "888-88-88-8888", 1200.00);
		

		
		System.out.println("Invoices and Employees processed polymorpphically:");
		
		for(Payable currentPayable: payableObjects)
		{
			//output currentPayable and it appropraite payment amount
			System.out.printf("%n%s %n%s: $%,.2f%n",
					currentPayable.toString(), //could invoke implicitly
					"payment due", currentPayable.getPayMentAmount());
		}
	}

}
