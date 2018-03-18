package exceptions;

public class DivByZeroException {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println(doDivision(a, b));
		
	}
	
	public static int doDivision(int i1, int i2) {
		return i1/i2; //BOOOM !
	}
	
}
