package exercise5_24;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a = 1; a <= 10; a++) {
			
			for(int b = a ; b > 0; b--)
			{
				System.out.print("*");
			}
			for(int c = 12 -a; c > 0; c--)
			{
				System.out.print(" ");
			}
			for(int d = 11 - a; d > 0; d--)
			{
				System.out.print("*");
			}
			for(int e = a + 2; e > 0; e--)
			{
				System.out.print(" ");
			}
			for(int e = a + 2; e > 0; e--)
			{
				System.out.print(" ");
			}
			for(int g = 11 - a; g > 0; g--)
			{
				System.out.print("*");
			}
			for(int c = 12-a; c > 0; c--)
			{
				System.out.print(" ");
			}
			for(int b = a ; b > 0; b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
