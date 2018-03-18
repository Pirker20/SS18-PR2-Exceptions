package exceptions.stack;

import java.time.LocalDate;

public class StackDemoError {

	public static void main(String[] args) {
		
		//stack's capacity is only e.g. 2 notes
		int numNotes = 2;
		Stack stack = new Stack(numNotes);

		try {	
			//first two pushes work
			stack.push(new Note(LocalDate.now(),"TODO1","DESC1"));
			stack.push(new Note(LocalDate.now(),"TODO2","DESC2"));
			//then 3rd push causes exceptions
			stack.push(new Note(LocalDate.now(),"TODO3","DESC3"));
		} catch (StackFullException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of main reached");
		
	}

}
