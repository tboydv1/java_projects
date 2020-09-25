package exercise5_26;

public class BreakReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.printf("%d ", i );
			if(i > 3)
				i = 11;
		}
		System.out.printf("%n%s","Broke out of loop at count == 5");
		
	}

}
