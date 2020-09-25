package examples;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05);
		
		System.out.printf("%s%20s%n", "Year","Amount onf deposit");
		
		for(int year = 1; year <= 10; year++) {
			
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
			
		}

	}
}	
