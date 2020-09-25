package exercise14_20;

public class CheckWriting {

	
	public static void main(String[] args) {
		
		
		StringBuilder cheque = new StringBuilder(9);
		
		System.out.println(cheque.capacity());
		System.out.println(cheque.length());
		
		String amount = "965598";
		
		cheque.append(amount);
		

		
		if(cheque.length() < 9) {
			
			int leadAsterisk = 9 - cheque.length();
			
			System.out.println(cheque.length() + " " + cheque + " " + leadAsterisk);
			
			for(int i = 1; i <= leadAsterisk; i++) {
				
				cheque.insert(0, "*");
			}
			
			System.out.println(cheque.length() + " " + cheque);
			
			
			
			
			
		}
		
	}
}
