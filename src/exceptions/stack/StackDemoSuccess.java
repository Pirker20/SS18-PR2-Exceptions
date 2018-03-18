package exceptions.stack;

import java.time.LocalDate;

public class StackDemoSuccess {

	public static void main(String[] args) {
		
		int numNotes = 10;
		Stack stack = new Stack(numNotes);
		
		try {	
			stack.push(new Note(LocalDate.now(),"TODO","DESC"));
			System.out.println(stack.pop());
			for(int i=0; i < numNotes; i++) {
				stack.push(new Note(LocalDate.now(),"TODO"+(i+1),"DESC"+(i+1)));
			}
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			e.printStackTrace();
		} catch (StackFullException e) {
			e.printStackTrace();
		}

		System.out.println("end of main reached");

	}

}
