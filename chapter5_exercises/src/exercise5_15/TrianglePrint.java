package exercise5_15;

public class TrianglePrint {

	public static void main(String[] args) {
		
		//Triangle A
		for(int i = 1; i <= 10; i++)
		{
			for(int n = i; n > 0; n--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Triangle B
		
		for(int l = 10; l > 0; l--)
		{
			for(int j = l; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		

//		Triangle C
		System.out.println();
		int A = 0, B = 10;
		for(int a = 1; a <= 10; a++) {
			//Spaces
			for(int x = A; x > 0; x--)
			{
				System.out.print(" ");
			}
			//Triangle
			for(int y = B; y > 0; y--)
			{
				System.out.print("*");
			}
			System.out.println();
			A +=1; B -= 1;
		
		}
		System.out.println();
		
		//Triangle D
		int C = 9,  D = 1;
		for(int a = 1; a <= 10; a++) {
			
			for(int x = C; x > 0; x--)
			{
				System.out.print(" ");
			}
			for(int y = D; y > 0; y--)
			{
				System.out.print("*");
			}
			System.out.println();
			C -=1; D += 1;
		
		}
	}
		

}
	

