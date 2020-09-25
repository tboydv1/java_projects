package exercise8_14;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DateFormat niger = new DateFormat(2,6,1997);
		DateFormat niger2 = new DateFormat("July",5,1997);
		DateFormat niger3 = new DateFormat(125,1997);
		
	display(niger);
	display(niger2);
	display(niger3);
		
	}
	
	public static void display(DateFormat obj) {
		System.out.printf("%s%n%n", obj.toString());
		
	}

}
