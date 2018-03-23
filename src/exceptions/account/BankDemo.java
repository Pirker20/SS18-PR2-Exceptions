package exceptions.account;

public class BankDemo {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		try {
			bank.addAccount("Max", 500, 500);
			bank.addAccount("Susi", 3000, 1000);
			System.out.println(bank);
			
			//throws an AccountNotFoundException
			//bank.transfer("Fritz", "Max", 10000);
			
			bank.transfer("Max", "Susi", 400);
			System.out.println(bank);
			
			//throws a BankException which wraps
			//a NotEnoughMoneyException by
			//means of the chaining mechanism...
			//bank.transfer("Max", "Susi", 700);
			
			System.out.println(bank);
			
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		} catch(BankException e) {
			e.printStackTrace();
		}		
		
		System.out.println("end of program - exiting...");
		
	}
	
}
