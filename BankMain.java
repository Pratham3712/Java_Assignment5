package Java_Assignment5;

public class BankMain {

	public static void main(String[] args) {
		BankA bank1 = new BankA();
		double balance = bank1.getBalance(1000);
		double interest = bank1.applyInterest(balance);
		System.out.println("BankA = " + interest);

		System.out.println("===================================");
		BankB bank2 = new BankB();
		balance = bank2.getBalance(1500);
		interest = bank2.applyInterest(balance);
		System.out.println("BankB = " + interest);

		System.out.println("===================================");
		BankB bank3 = new BankB();
		balance = bank3.getBalance(2000);
		interest = bank3.applyInterest(balance);
		System.out.println("BankC = " + interest);

	}

}
