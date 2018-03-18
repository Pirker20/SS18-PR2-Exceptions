package exceptions.stack;

public class Stack {

	private Note[] notes;
	private int index;
	
	public Stack(int size) {
		notes = new Note[size];
		index = -1;
	}
	
	public void push(Note note) throws StackFullException {
		
		if(index == notes.length-1) {
			throw new StackFullException("error: capacity of "+notes.length+" reached!");
		}
		
		notes[++index] = note;
	}
	
	public Note pop() throws StackEmptyException {
		
		if(index == -1) {
			throw new StackEmptyException("error: cannot pop from the empty stack");
		}
		
		Note n = notes[index];
		notes[index--] = null;
		return n;
	}
	
}
