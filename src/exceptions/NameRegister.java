package exceptions;

import java.util.List;

public class NameRegister {

	private List<String> names;
	
	public void addName(String name) {
		names.add(name); //BOOOM!
	}
	
	public static void main(String[] args) {
		
		NameRegister nr = new NameRegister();
		nr.addName("Max Mustermann");

	}

}
