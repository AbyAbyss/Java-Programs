package Trying;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("111121444", 1000);
		//BankAccount acc3 = new BankAccount("31323444", 3000);
		//System.out.println(acc3.ID);  
		
		acc1.setName("AbyAbyss");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(1500);
		acc1.makeDeposit(300);
		acc1.payBill(400);
		acc1.accure();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	//properties
	private static int ID = 1000;			     //internal ID
	private String accountNumber;				 //ID + Random 2-digit + first 2 of ssn
	private static final String routingNumber = "0045454";
	private String name;
	private String SSN;
	private double balance;
	
	
	
	//constructor
	
	public BankAccount(String SSN, double initDeposit){
		balance  = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber(){
		int random = (int)(Math.random()*100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
		
	}

	
//Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void payBill(double amount){
		
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount){
		balance = balance + amount;
		System.out.println("Depositing: " + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: $" + balance);
	}

	@Override
	public void accure() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString(){
		return "[ Name: " + name + " ]" + "\n[ Account Number: " + accountNumber + " ]" + "\n[ Routing Number: " + routingNumber + " ]" + "\n[ Balance: " + balance + " ]" ;
	}
	
}
