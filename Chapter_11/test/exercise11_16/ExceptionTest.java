package exercise11_16;

public class ExceptionTest {


	public static void main(String args[]) throws Exception {
		
		try {
			
			method2();
			
			
		}
		catch(ExceptionA e)
		{
			System.err.println("Catch block A catches Exception C");
		}
		
	}
	
	public static void method1() throws ExceptionB {
		
			throw new ExceptionB();
		
	} 
	
	public static void method2() throws Exception {
		
		try {
			
			method1();
		}
		catch(ExceptionA em) {
			
			System.err.println("Catch block A catches ExceptionB");
			throw new ExceptionC("Catch block A catches ExceptionB",em);
			
		}
	}
	
	
}
