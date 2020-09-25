package exercise5_23;

public class LogicalNegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4, y = 8, a = 1, g = 5, i = 3, j = 6,b = 9;
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!((i > 4) || (j <= 6)));
			System.out.println();
		System.out.println(!(x > 5 || y >= 7));
		System.out.println(!(a == b && g != 5));
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println(!(i > 4) && !(j <= 6));
			
	}

}
