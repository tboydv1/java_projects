package exercise5_21;

public class PythagoreanTriples {

	public void checkTriples() {
	
		System.out.printf("%s%10s%15s%n", "Side1", "Side2", "Hypotenus");
		int side1, side2, hypotenus;
		for(int a = 1; a <= 500; a++) {
			side1 = a * a;
			for(int b = 1; b <= 500; b++) {
				side2 = b * b;
				for(int c = 1; c <= 500; c++) {
					hypotenus = c * c;
					if(side1 + side2 == hypotenus)
					{
						System.out.printf("%5d%10d%15d%n", a, b, c);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PythagoreanTriples system = new PythagoreanTriples();
		
		system.checkTriples();
	}

}
