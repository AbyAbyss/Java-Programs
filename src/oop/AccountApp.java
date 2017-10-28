package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		//This is also polymorphism
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
