package exercise7_39;


import java.util.Scanner;

public class GradeBook {

	
	int[][] grades; 
	String courseName;
	
	Scanner input = new Scanner(System.in);
	public GradeBook(String courseName, int noOfStudents, int noOfExams) {
		
		this.grades = new int[noOfStudents][noOfExams];
		this.courseName = courseName;
		setToDefault();
		

	}
	
	public void setToDefault() {
		
		for(int student = 0; student < grades.length; student++) {
			
			for(int exam = 0; exam < grades[student].length; exam++) {
				
				grades[student][exam] = -1;
			}
		}
	}
	
	public void setGrade() {
		
		
		System.out.println("Enter student number to set exam grades: ");
		int studentNo = input.nextInt();
		
		System.out.println("Enter exam number: ");
		int examNo = input.nextInt();
		
		System.out.println("Enter exam grade: ");
		int examGrade = input.nextInt();
		
		grades[studentNo - 1][examNo - 1] = examGrade;	
		
	}
	
	public String getCourseName() {
		
		return courseName;
	}
	
	public void processGrades() {
		
		
		outputGrades();
		
		 // call methods getMinimum and getMaximum
		 System.out.printf("%n%s %d%n%s %d%n%n",
		 "Lowest grade in the grade book is", getMinimum(),
		 "Highest grade in the grade book is", getMaximum());
		
		 // output grade distribution chart of all grades on all tests

	}
	
	public int getMinimum() {
		
	int smallest = grades[0][0];	
		
		for(int[] course: grades) 
			
			for(int grade: course) 
				
				if(grade < smallest) 
					smallest = grade;
				
		
		return smallest;
	}
	
	public int getMaximum() {
		
		int highestGrade = grades[0][0];
		
		for(int[] course: grades) {
			
			for(int grade: course) {
				
				if(grade > highestGrade) {
					highestGrade = grade;
				}
			}
		}
		
		return highestGrade;
	}
	

	public double getAverage(int[] studentGrade) {
		
		int total = 0;
		
		for(int grade: studentGrade) {
			
			total+= grade;
		}
		
		return total / studentGrade.length;
	}
	
	public void outputBarChart() {
		
		System.out.println("Overall grade distribution: ");
		
		int[] frequency = new int[11];
		
		for(int[] studentGrades: grades) {
			
			for(int grade: studentGrades) {
				if(grade > 0)
				++frequency[grade / 10];
			}
		}
		
		for(int count = 0; count < frequency.length; count++) {
			
			if(count == 10)
				System.out.printf(" %5d: ", 100);
			
			else 
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			
			for(int stars = 0; stars < frequency[count]; stars++) {
				
//				if(frequency[count] > 0)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void outputGrades() {
		
		System.out.printf("The grades are: %n%n");
		System.out.printf("              ");
		
		for(int test = 0; test < grades[0].length; test++) {
			
			System.out.printf(" Test %d  ", test+ 1);
				
		}
				System.out.println("Average ");
				
			for(int student = 0;  student < grades.length; student++) {
				
				System.out.printf("Student %4d ", student + 1);
				
				for(int grade : grades[student]) {
					
					System.out.printf("%8d", grade);
					
				}
				
				double average = getAverage(grades[student]);
				
				System.out.printf("%9.2f", average);
				
				System.out.println();	
			}
		
		
	}
}
 