package examples;

public class UsingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			throwException();
		}
		catch(Exception e)
		{
			System.err.println("Exception handled in main");
		}
		
		doesNotThrowException();
		
	}
	
	public static void throwException() throws Exception{
		
		try
		{
			System.out.println("Method throwException");
			throw new Exception(); //generate exception
		}
		catch(Exception e) 
		{
			System.err.println("Exception handled in method throwException");
			throw e; //re-throw exception
		}
		
		//code here would not be reached
		finally
		{
			System.err.println("Finally block executed in throwException");
		}
		
		//code here would not be reached
	}
	
	public static void doesNotThrowException()
	{
		try
		{
			System.out.println("Method doesNotThrowException");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		finally
		{
			System.err.println("Finnaly executed in doesNotThrowException");
		}
		
		System.out.println("End of method doesNotThrowException");
	}

}
