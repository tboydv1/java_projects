package examples;

public class PackageDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PackageData packageData = new PackageData();
		
		System.out.printf("After instantiation:%n%s%n", packageData);
		
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		System.out.printf("%nAfter instantiation:%n%s%n", packageData);
	}

}

class PackageData{

	int number;
	String string;
	
	public PackageData() {
		
		number = 0; 
		string = "Hello";
	}
	
	public String toString() {
		
		return String.format("number: %d; string: %s", number, string);
	}
}
