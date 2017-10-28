package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	//final will not change even won't be able..
	private static final String routingNumber = "11111";
	
	//Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definition
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//overloading
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT CREATED "+accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT CREATED "+accountType);
		System.out.println("INITIAL DEPOSIT OF: $"+initDeposit);
		String Msg = "";
		if(initDeposit < 1000){
			Msg = "ERROR: Minimum deposit is 1000";
		}else{
			Msg = "Thanks for your initial deposit $"+initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	//getters and setters
	public void setName(String name){
		this.name = "Mr. " + name;
	}
	
	public String getName(){
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface Methods
	public void setRate(){
		System.out.println("Setting Rate!!");
	}
	public void increaseRate(){
		System.out.println("Increasing Rate!!");
	}
	
	
	//Define methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("Deposit");
	}
	void withdraw(double amount){
		balance = balance + amount;
		showActivity("Withdraw");
	}
	
	
	//can only be call within the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION " + activity);
		System.out.println("YOUR NEW BALANCE IS " + balance);
	}
	void checkBalance(){
		System.out.println("Balance is "+balance);
	}
	void getStatus(){
		
	}
	
	@Override
	public String toString(){
		return "[ NAME: " + name +", ACCOUNT: " + accountNumber + ", ROUTING #: "+routingNumber+", BALANCE $" +balance;
	}
}
