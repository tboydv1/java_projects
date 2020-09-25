package chapter_7;

public class chechSoduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grid[][] = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
	{6, 7, 2, 1, 9, 5, 3, 4, 8},
	{1, 9, 8, 3, 4, 2, 5, 6, 7},
	{8, 5, 9, 7, 6, 1, 4, 2, 3},
	{4, 2, 6, 8, 5, 3, 7, 9, 1},
	{7, 1, 3, 9, 2, 4, 8, 5, 6},
	{9, 6, 1, 5, 3, 7, 2, 8, 4},
	{2, 8, 7, 4, 1, 9, 6, 3, 5},
	{3, 4, 5, 2, 8, 6, 1, 7, 2}
	};
		
		System.out.printf("%s", isValid(grid) ? "Valid solution" : "Invalid Solution");
		
	}
	
	//check whether a solution is valid
	public static boolean isValid(int[][] grid) {
		
		for(int i = 0; i < 9; i++)
			if(!isTo9(grid[i])) // check whether each row has numbers 1 to 9
				return false;
		
		//check whether each column has 1 to 9
		int [] column = new int[9];
		for(int row = 0; row < 9; row++) {
			//obtain a column in the one-dimensional array
			for(int col = 0; col < grid[row].length; col++) {
				column[col] = grid[row][col];
			}
		}
		
		if(!isTo9(column))
			return false;
		int [] list = new int[9]; //get all numbers in the box to list 
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				int k = 0;

				for(int row = i * 3; row < i * 3 + 3; row++)
					for(int col = j * 3; col < j * 3 + 3; col++)
						list[k++] = grid[row][col];
				
						if(!isTo9(list))
							return false;
			}
		}
		return true ;
	}
	public static boolean isTo9(int[] list) {
		
		//make a copy of the array
		int[] temp = new int[list.length];
		System.arraycopy(list, 0, temp, 0, list.length);
		
		//sort the Array
		java.util.Arrays.sort(temp);
		
		for(int i = 0; i < 9; i++)
			if(temp[i] != i + 1)
				return false;
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
