package exercise8_16;

public class IntegerSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			
			IntegerSet obj = new IntegerSet();
			obj.parse("11100");
			
			IntegerSet obj1 = new IntegerSet();
			obj1.parse("207");
			
			obj.add(obj1);
			
			System.out.println(obj);
			
//			System.out.println(obj.isLessThanOrEqualTo(obj1));
			
	
	}

}
