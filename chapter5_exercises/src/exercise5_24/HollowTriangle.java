package exercise5_24;
import java.util.Scanner;

public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows for hollow triangle: ");
		int num = input.nextInt();
		int L = num, U = 1;
		for(int v = 1; v <=num; v++)
		{
			
			for(int y = L; y > 0; y--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(L < 2) {
				for(int y = U+1; y > 0; y--)
				{
					System.out.print("*");
				}
				break;
			}
			if(v > 1) {
				for(int r = U; r > 0; r--)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				U +=2;
				
			}
			L-=1;
			System.out.println();
			
			
			
		}

	}

}
