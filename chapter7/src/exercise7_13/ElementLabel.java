package exercise7_13;

public class ElementLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] sales = new int[3][5];
		
		for(int row = 0; row < sales.length; row++) {
			
			for(int column = 0; column < sales[row].length; column++) {
				
				sales [row][column] = 0;
				System.out.printf("row %d column %d = %d%n", row, column, sales[row][column]);
			}
			System.out.println();
		}
	}

}
