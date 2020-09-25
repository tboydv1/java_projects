package chapter4.exercise422;

public class Tabular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		System.out.println("N\t10*N\t100*N\t1000*N");
		System.out.println();
		while(counter <= 5)
		{
			System.out.printf("%d\t%d\t%d\t%d%n", counter *1, counter * 10, counter *100, counter*1000);
			counter++;
		}
	}

}
