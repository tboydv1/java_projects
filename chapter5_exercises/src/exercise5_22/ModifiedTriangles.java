package exercise5_22;

public class ModifiedTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		System.out.printf("%s%15s%23s%17s%n","(a)","(b)","(c)","(d)");
		int A = 1, B = 10,  E = 5,F = 15;
		for(int t = 1; t <= 10; t++) {
			//Triangle A
			for(int n = A; n > 0; n--) {
			System.out.print("*");
			}
			//Spaces
			for(int a = F; a > 0; a--)
			{
				System.out.print(" ");
			}
			//Triangle B
			for(int b = B; b > 0; b--)
			{
				System.out.print("*");
			}
			//Spaces
			for(int a = E; a > 0; a--)
			{
				System.out.print(" ");
			}
			//Triangle C
			for(int c = B; c > 0; c--)
			{
				System.out.print("*");
			}
			// Spaces
			for(int a = F; a > 0; a--)
			{
				System.out.print(" ");
			}
			//Triangle D
			for(int n = A; n > 0; n--) {
				System.out.print("*");
			}
			System.out.println();
			A += 1; B -= 1; ;E +=2;F -=1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}