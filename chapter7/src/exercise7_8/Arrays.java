package exercise7_8;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] a = {3, 4, 5, 3, 5, 3, 4, 2, 4,7, 8};
		int[] b = new int [34];
		
		
		
		//fill array a and b with values
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int count = 0; count < b.length; count++) {
			
			System.out.printf("%5d%8d%n",count, b[count]);
			
		}	
			
		
		
	}

}
