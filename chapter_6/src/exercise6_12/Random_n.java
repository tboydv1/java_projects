package exercise6_12;
import java.security.SecureRandom;

public class Random_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom random = new SecureRandom();
		int n,a,b,c,d,e,f,g;
		
		for(int i = 1; i <= 10; i++) {
		 n = 1 + random.nextInt(2);
		 a = 1 + random.nextInt(100);
		 b = random.nextInt(9);
		 c = 1000 + random.nextInt(1112);
		 d = -1 + random.nextInt(1);
		 e = -3 + random.nextInt(11);
		 
		 System.out.printf("n = %d%na = %d%nb = %d%nc = %d%nd = %d%ne = %d%n%n", n, a, b, c, d, e);
		}
	}

}
