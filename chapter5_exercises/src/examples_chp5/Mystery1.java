package examples_chp5;

public class Mystery1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Assume that i = 1, j = 2, k = 3 and m = 2. What does each of the following statements print?
		int i = 1, j = 2, k =3, m = 2;
		
				 System.out.println(i == 1);
				System.out.println(j == 3);
				 System.out.println((i >= 1) && (j < 4));
				 System.out.println((m <= 99) & (k < m));
				 System.out.println((j >= i) || (k == m));
				 System.out.println((k + m < j) | (3 - j >= k));
				 System.out.println(!(k > m));
	}

}
