package examples;

public class StringBuilderAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		char character = 'Z';
		int integerValue = 7;
		long longValue = 100000000l;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		
		
		StringBuilder lastBuffer = new StringBuilder("last buffer");
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(objectRef)
		 .append(System.getProperty("line.separator"))
				.append(string)
				 .append(System.getProperty("line.separator"))
				.append(charArray, 0, 3)
				 .append(System.getProperty("line.separator"))
				.append(booleanValue)
				 .append(System.getProperty("line.separator"))
				.append(character)
				 .append(System.getProperty("line.separator"))
				.append(integerValue)
				 .append(System.getProperty("line.separator"))
				.append(longValue)
				 .append(System.getProperty("line.separator"))
				.append(floatValue)
				 .append(System.getProperty("line.separator"))
				.append(lastBuffer);
		
		System.out.printf("buffer contains%n%s%n", buffer.toString());
				
	}

}
