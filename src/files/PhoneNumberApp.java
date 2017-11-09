package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// read from the file
		//valid number should be 10 digits
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[5];
		String phoneNum = null;
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				for(int i =0;i<phoneNums.length;i++){
				phoneNums[i] = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				
				//e.printStackTrace();
				System.out.println("File not found");
			} catch (IOException e) {
				
				//e.printStackTrace();
				System.out.println("Error:.. Could not read file");
			}
			
		for(int i = 0;i<phoneNums.length;i++){
			phoneNum = phoneNums[i];
			try{
				if(phoneNum.length() != 10){
					throw new TenDigitsException(phoneNum);
				}
				if((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))){
					throw new AreaCodeException(phoneNum);
				}
				for(int n =0;n<phoneNum.length()-2;n++){
					if(phoneNum.substring(n, n+1).equals("9")){
						if(phoneNum.substring(n+1,n+3).equals("11")){
							throw new EmergencyException(phoneNum);
						}
					}
				}
				System.out.println(phoneNum);
			} catch(TenDigitsException e){
				System.out.println("Error:... Phone Number is not 10 digits");
				System.out.println(e.toString());
			} catch(AreaCodeException e){
				System.out.println("Error:... Phone number has invalid area code");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("Invalid 911 sequence found");
				System.out.println(e.toString());
			}
		}
	}

}


class TenDigitsException extends Exception{
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString(){
		return ("TenDigitsException: " + num);
	}
}
class AreaCodeException extends Exception{
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString(){
		return ("AreaCodeException: " + num);
	}
}
class EmergencyException extends Exception{
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString(){
		return ("EmergencyException: " + num);
	}
}