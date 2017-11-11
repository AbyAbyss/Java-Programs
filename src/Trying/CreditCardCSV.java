package Trying;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardCSV {

	public static void main(String[] args) {
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\creditcard.csv";
		File file = new File(filename);
		List<String[]> transactions = new ArrayList<String[]>();
		
		String dataRow;
		double balance = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine()) != null){
				String[] Line = dataRow.split(",");
				transactions.add(Line);
			}
			
			
			br.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//System.out.println(transactions.get(3)[1]);
		
		for (String[] transaction : transactions){
			String date = transaction[0];
			String type = transaction[1];
			String spentOn = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			
			System.out.println("Date: " + date + " | Type: " + type + " | Spent On: " + spentOn + " | Amount: " + amount);
			
			if(type.equalsIgnoreCase("credit")){
				System.out.println("Crediting $" + amount + " to your account");
				balance = balance + amount;
			}
			else if(type.equalsIgnoreCase("debit")){
				System.out.println("Debiting $" + amount + " from your account");
				balance = balance + amount;
			} else {
				System.out.println("Your current balance is : $" + balance);
			}
		}
		
	 if(balance > 0){
		 System.out.println("You have been charged 10% fee from your account");
		 balance = balance * .1;
		 System.out.println("Your current balance is : $" + balance);
	 }
	 
	 if(balance < 0 ){
		 System.out.println("You have over paid");
		 System.out.println("Your current balance is : $" + balance);
	 }
	 if(balance == 0){
		 System.out.println("Thank you for your payment");
		 System.out.println("Your current balance is : $" + balance);
	 }
	}

}
