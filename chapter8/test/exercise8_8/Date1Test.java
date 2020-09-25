package exercise8_8;

public class Date1Test {

	
	public static void main(String[] args) {
		Date1 bar = new Date1(2, 31, 2017);
		
		
			
			for(int count = 1; count <= 300; count++) {
				bar.nextDay();
				
			
				System.out.printf("%s%n", bar.toString());
				
				if(bar.getDay() == bar.getDaysPerMonth(bar.getMonth())) {
					System.out.print(bar.getMonth());
				System.out.println("\n");
				}
				
			}
	
			
	}
}
