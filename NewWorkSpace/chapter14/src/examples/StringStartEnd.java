package examples;

public class StringStartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = {"started", "starting", "ended", "ending"};
		
		for(String string: strings)
		{
			if(string.startsWith("st"))
				System.out.printf("\"%s\"starts with \"st\"%n", string);
		}
		
		System.out.println();
		
		for(String chars: strings)
		{
			if(chars.startsWith("art", 2))
				System.out.printf("\"%s\" starts with \"art\" at position \"2\"%n", chars);
		}
		
		System.out.println();
		
		for(String test: strings)
		{
			if(test.endsWith("ed"))
				System.out.printf("\"%s\" ends with \"ed\"%n", test);
		}
	}

}
