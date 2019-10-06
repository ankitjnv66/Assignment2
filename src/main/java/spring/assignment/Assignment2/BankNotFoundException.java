package spring.assignment.Assignment2;

public class BankNotFoundException extends RuntimeException{

	public BankNotFoundException(String bankName) {
		super(bankName+" does not exist!");
	}
}
