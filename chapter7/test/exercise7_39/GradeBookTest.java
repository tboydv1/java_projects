package exercise7_39;
import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total number of students: ");
		int totalOfStudents = input.nextInt(); 
		

		System.out.println("Enter total number of exams: ");
		int totalOfExams = input.nextInt(); 
		

		
		GradeBook class5 = new GradeBook("CS101 Into to computer science: ", totalOfStudents, totalOfExams);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n",
				class5.getCourseName());
		
				class5.processGrades();
				
		System.out.println("Enter 's' to set students grade or q to terminate");
		char sentinel = input.next().charAt(0);
		
		while(sentinel == 's') {
			
			class5.setGrade();
			
		System.out.println("Enter 's' to continue or 'q' to quit");
		sentinel = input.next().charAt(0);
			
		}
		
		
		class5.processGrades();
		
		class5.outputBarChart();
		
		
		
	}

}
