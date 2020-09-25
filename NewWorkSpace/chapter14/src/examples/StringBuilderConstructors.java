package examples;

public class StringBuilderConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");
		
		System.out.printf("buffer1 = \"%s\"%d%n", buffer1, buffer1.length());
		System.out.printf("buffer1 = \"%s\"%d%n", buffer2, buffer2.length());
		System.out.printf("buffer1 = \"%s\"%d%n", buffer3, buffer3.length());
		
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", buffer.toString(),
				buffer.length(), buffer.capacity());
		
		buffer.ensureCapacity(75);
		
		System.out.printf("New capacity = %d%n%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("New length = %d%nbuffer = %s%n",
				buffer.length(), buffer.toString());
		
		System.out.println();
		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("Character at 0: %s%nCharater at 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));
		
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		
		System.out.print("The characters are: ");
		
		for(char character: charArray)
			System.out.print(character);
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		
		buffer.reverse();
		
		System.out.printf("%n%nbuffer = %s", buffer.toString());

	}

}
