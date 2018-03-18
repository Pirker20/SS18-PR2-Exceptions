package exceptions;

public class NumbersArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
		try {
			for(int n=0;n <= numbers.length; n++) {
				System.out.println(numbers[n]); //BOOOM!
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
