package exercise6_28;

import java.util.Scanner;
public class ExamRecordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter students average: ");
		double avg = input.nextDouble();
		
		System.out.println(ExamRecord.qualityPoints(avg));
	}

}
