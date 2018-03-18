package exceptions.stack;

public class StackEmptyException extends Exception {

	public StackEmptyException() {}
		
	public StackEmptyException(String msg) {
		super(msg);
	}
	
}
