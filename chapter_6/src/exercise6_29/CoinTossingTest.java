package exercise6_29;
import java.util.Scanner;
public class CoinTossingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Toss Coin%n%s%n","Enter number of coin flip");
		int select = input.nextInt();
		
		
			CoinTossing.tossCoin(select);
		
		
	}

}
