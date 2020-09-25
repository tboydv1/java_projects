package exercise5_24;
import java.util.Scanner;
public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int A = 20, B = 1;
//		for(int i = 1; i <= 15; i++)
//		{
//			for(int s = A; s > 0; s--)
//			{
//				System.out.print(" ");
//			}
//			for(int m = B; m > 0; m--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			A-=1; B+=2;
//		}
//		for(int g = 1; g <= 4; g++)
//		{
//			for(int l = 6; l > 0; l--)
//			System.out.print(" ");
//			for(int f = 29; f > 0; f--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		int N = 29, Y = 6;
//		for(int h =1; h<= 15; h++)
//		{
//			for(int b = Y; b>0; b-- )
//			{
//				System.out.print(" ");
//			}
//			for(int v = N; v > 0; v--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			N-=2; Y +=1;
//		}
//		System.out.println();
//		
		Scanner input= new Scanner(System.in); 
		System.out.print("Enter (odd)number of rows for Hollow diamond:  ");
		int num = input.nextInt();
		
		int Ltabs = num; //spaces to the left 
		int Rtabs = 1; //space to the right
		int div = num / 2;
		for(int v = 1; v <=num; v++)
		{
			
			for(int y = Ltabs; y > 0; y--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(v == num)
				break;
	
			if(v > 1) {
				for(int r = Rtabs; r > 0; r--)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				if(v > div)
					Rtabs -=2;
				else
					Rtabs +=2;
				
			}
			if(v > div)
				Ltabs +=1;
			else
				Ltabs -=1;
			
			System.out.println();
			
			
			
		}
		System.out.println();

			} 
}