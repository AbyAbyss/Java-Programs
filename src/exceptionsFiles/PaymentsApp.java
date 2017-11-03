package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		
		
		do{
			System.out.print("Enter the payment amount: ");
			Scanner in = new Scanner(System.in);
			try{
			 payment = in.nextDouble();
			 if(payment < 0){
				throw new NegativePaymentException(payment);
			 }
			 else{
					// break;   //or
				 positivePymt = true;
			}
			
			}catch (NegativePaymentException e){
				System.out.println(e.toString());
				System.out.println("Please try again...");
				positivePymt = false;
			}
		}while(!positivePymt);
		System.out.println("Thank you for your payment of $" + payment);
	}

}
