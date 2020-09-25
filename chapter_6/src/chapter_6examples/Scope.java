package chapter_6examples;

public class Scope {
 
	private static int x = 1; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("%nlocal x in main is %d%n", x);
	}
	public static void useLocalVariable() {
		int x = 25;
		
		//value of x on entering 
		System.out.printf("%nLocal x on entering method useLocalVariable is %d%n", x);
		
		x++;
		System.out.printf("local x on exiting method useLocalVariable id %d%n", x);
		
	}
	public static void useField() {
		
		System.out.printf("%nfield x on entering method useFied is %d%n", x);
		
		x *=10;
		System.out.printf("field x on exiting method useFied is %d%n", x);
		
	}

}
