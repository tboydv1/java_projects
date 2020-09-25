package exercise7_14;

public class ArrayArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("The product of 5 * 5 is: %d %n", product(5,5));
		System.out.printf("The product of 2 * 2 * 2 is: %d %n", product(2,2,2));
		System.out.printf("The product of 5 * 10 is: %d %n", product(5,10));


	}
	public static int product(int... number) {
		int product = 1;
				for(int value: number) {
			product*= value;
		}
		return product;
	}

}
