package Java_Assignment5;

public class Bank {
	protected double accounybalance;
	protected static double interest = 0.10;

	public double getBalance(double accounybalance) {
		return accounybalance;
	}

	public double applyInterest(double accounybalance) {
		accounybalance = accounybalance * interest;
		return accounybalance;
	}

	@Override
	public String toString() {
		return "Bank [accounybalance=" + accounybalance + "]";
	}

}
