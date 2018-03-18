package exceptions;

public class BasicExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			
			//TRY BLOCK:
			//any code that may cause an exception
			
		} catch(Exception exc) {
			
			//CATCH BLOCK:
			//handling here only prints
			//the stack trace information
			exc.printStackTrace();
			
		} finally {
			
			//FINALLY BLOCK:
			//optional code to
			//cleanup any resources
			
		}
		
	}
		
	public static void doSomething() throws Exception {
		
		// any code that may throw an Exception
		// without caring for it but instead
		// delegates the handling to the caller
		
	}

}
