package exceptionsFiles;

public class NegativePaymentException extends Exception{
	double payment;
	public NegativePaymentException(double payment){
		//System.out.println("ERROR:..Negative Payment");
		this.payment = payment;
	}
	
	public String toString(){
		return "Error:.. Cannot take nagative payment $" + payment;
	}
}
