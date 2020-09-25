package examples;

public class StringIndexMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letters = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("'c' is located at %d%n", letters.indexOf('c'));
		System.out.printf("'a' is located at index %d%n", letters.indexOf('a', 1));
		System.out.printf("'$' is located at index %d%n%n", letters.indexOf('$'));
		
		System.out.printf("Last 'c' is located at index %d%n", letters.lastIndexOf('c'));
		System.out.printf("Last 'a' is located at index %d%n", letters.lastIndexOf('a', 25));
		System.out.printf("Last '$' is located at index %d%n", letters.lastIndexOf('$'));
		
		System.out.printf("\"def\"is located at index %d%n", letters.indexOf("def"));
		System.out.printf("\"def\"is located at index %d%n", letters.indexOf("def", 7));
		System.out.printf("\"hello\"is located at index %d%n", letters.indexOf("hello"));
		
		System.out.printf("\"def\"is located at index %d%n", letters.lastIndexOf("def"));
		System.out.printf("\"def\"is located at index %d%n", letters.lastIndexOf("def", 35));
		System.out.printf("\"hello\"is located at index %d%n", letters.lastIndexOf("hello"));
		
		//test substring methods
		System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
		System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but not including 6 is", 
				letters.substring(3, 6));
		
	}

}
