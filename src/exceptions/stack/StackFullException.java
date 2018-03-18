package exceptions.stack;

public class StackFullException extends Exception {

	public StackFullException(String msg) {
		super(msg);
	}
	
	//NOTE: We can also define a constructor that takes
	//the int size param representing the stack's max size.
	//Then this size is added to the message String and delegated
	//to the super(String msg) constructor of the Exception class
	public StackFullException(int size) {
		super("error: stack is full - max size is: "+size);
	}
	
}
