package exercise7_11;

public class ArrayBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bonus[] = new int[15];
		
		for(int count = 0; count < bonus.length; count++) {
			bonus[count] = count + 1;
			System.out.println(bonus[count]);
		}
	}

}
