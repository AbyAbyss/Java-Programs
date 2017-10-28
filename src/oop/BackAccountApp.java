package oop;

public class BackAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		
		//with encapsulation
		//acc1.name = "Aby Abyss";
		
		
		acc1.setName("Aby Abyss");
		System.out.println(acc1.getName());
		
		acc1.setSsn("123456");
		System.out.println("SSN: " + acc1.getSsn());
		acc1.accountNumber = "0111111";
		
		acc1.balance = 10000;
		acc1.deposit(1500);
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.withdraw(2000);
		//acc1.routingNumber = "12345";
		
		//polymorphism through overridden
		System.out.println(acc1.toString());
		
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0222222";
		
		BankAccount acc3 = new BankAccount("Saving Account",5000);
		acc3.accountNumber = "0333333";
		/*acc3.checkBalance();
		//System.out.println(acc3.toString());
		
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Sanju";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
		
		
	}

}
