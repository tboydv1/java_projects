package exercise5_12;

public class OddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		for(int m = 1; m <= 15; m +=2)
		{
			result *= m;
			System.out.print(m + " ");
		}
		System.out.printf("%nProduct of integers from (1-15) is: %d",result);
	}

}
