package examples;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy Birthday";
		String s10 = "hello";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n%n", s1, s2, s3, s4);
		
		if(s10 == "hello") {
			System.out.println("True");
		}
		
		//test for equality
		if(s1.equals("hello"))
			System.out.println("s1 equals \"hello\"");
		else
			System.out.println("s1 does not equal \"hello\"");
		
		//test for equality with ==s1 is the same object \"hello\""
		if(s1 == "hello")
			System.out.println("s1 is the same object \"hello\"");
		else
			System.out.println("s1 is not the same object as \"hello\"");
		
		//test for equality and (ignore case)
		if(s3.equalsIgnoreCase(s4))
			System.out.printf("%s equals %s with ignored%n", s3, s4);
		else
			System.out.println("s3 does not equals s4");
		
		System.out.printf(
				"%ns1.compareTo(s2) is %d", s1.compareTo(s2));
		
		System.out.printf(
				"%ns2.compareTo(s1) is %d", s2.compareTo(s1));
		
		System.out.printf(
				"%ns1.compareTo(s1) is %d", s1.compareTo(s1));
		System.out.printf(
				"%ns3.compareTo(s4) is %d", s3.compareTo(s4));
		System.out.printf(
				"%ns4.compareTo(s3) is %d", s4.compareTo(s3));
		
		if(s3.regionMatches(0, s4, 0, 5))
			System.out.println("First 5 character of s3 and s4 match");
		else
			System.out.println("First 5 characters of s3 and s3 do not match");
		
		if(s3.regionMatches(true, 0, s4, 0, 5))
			System.out.println("First 5 characters of s3 and s4 match with case ignored");
		else
			System.out.println("First 5 characters of s3 and s4 do not match");

			
	}

}
