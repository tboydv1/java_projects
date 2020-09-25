package examples;

public class InsertAndDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		char characterValue = 'K';
		int integerValue = 7;
		float floatValue = 2.5f;
		long longValue = 1000000000l;
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.insert(0, objectRef);
		buffer.insert(0, "  ");
//		buffer.insert(0, string);
//		buffer.insert(0, "  ");
//		buffer.insert(0, charArray);
//		buffer.insert(0, "  ");
//		buffer.insert(0, charArray, 3, 3);
//		buffer.insert(0, "  ");
//		buffer.insert(0, booleanValue);
//		buffer.insert(0, "  ");
//		buffer.insert(0, characterValue);
//		buffer.insert(0, "  ");
//		buffer.insert(0, integerValue);
//		buffer.insert(0, "  ");
//		buffer.insert(0, longValue);
//		buffer.insert(0, "  ");
//		buffer.insert(0, floatValue);
		
		System.out.printf("buffer after inserts: %n%s%n%n",
				buffer.toString());
		
//		buffer.deleteCharAt(10);
//		buffer.delete(2, 6);
//		
//		System.out.printf("buffer after deletes: %n%s%n%n",
//				buffer.toString());
		
		buffer.insert(0, 'f');
		buffer.append(" You can add values to the end");
		//buffer.insert(5, 'Z');
		
		
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.charAt(15));
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
		
//		System.out.println(buffer.lastIndexOf("h"));
		
//		for(int i = 0; i < buffer.length(); i++) {
//			
//			System.out.println(buffer+"  "+ );
//		}
		
//		for(StringBuilder value: buffer.length())
//			System.out.println(value);
//			
		
		System.out.printf("buffer after deletes: %n%s%n%n",
				buffer.toString());
		
		
	}

}
