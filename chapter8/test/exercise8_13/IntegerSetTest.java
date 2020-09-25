package exercise8_13;

public class IntegerSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		boolean array[] = new boolean[101];
		
		//display integer set objects initial values
		System.out.printf("IntegerSet object1 initial values %n%s%n", setA);
		System.out.printf("IntegerSet object2 initial values %n%s%n", setB);
		
		
		for(int i = 1; i < array.length; i++) {
			
			if(i % 2 == 0)
			setA.insertElement(i);
			
			if(i % 5 == 0)
				setB.insertElement(i);
			
		}
		
		System.out.printf("IntegerSet object1 after inserting values %n%s%n%n", setA);
		System.out.printf("IntegerSet object2 after inserting values %n%s%n%n", setB);
		
		array = IntegerSet.union(setA,setB);
		
		displaySet("New set after union", array);
		
		array = IntegerSet.intersection(setA, setB);
		
		displaySet("New set after intersection", array);
		
		setA.deleteElement(8);
		
		System.out.printf("IntegerSet object1 after deleting values 8 %n%s%n%n", setA);
		
		setB.deleteElement(15);
		
		System.out.printf("IntegerSet object1 after deleting values 8 %n%s%n%n", setB);
		
		
		
	}
	
	public static void displaySet( String message, boolean[] array ) {
		String newSet = "";
		
		System.out.printf("%s%n", message);
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == true) {
				newSet= newSet +" "+ i;
			}
		}
		
		 System.out.printf("%s%s%s%n%n", "[",newSet,"]");
	}

}
