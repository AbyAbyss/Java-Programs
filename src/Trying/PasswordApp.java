package Trying;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordApp {

	public static void main(String[] args) {
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\Passwords.txt";
		File file = new File(filename);
		String password = null;
		String[] passwords = new String[13];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i = 0;i<passwords.length;i++){
			passwords[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Error:.. File not found");
		} catch (IOException e) {
			System.out.println("Can not read the file");
			//e.printStackTrace();
			
			
		}
			for(int n =0;n < passwords.length;n++){
				try{
					password = passwords[n];
					char[] pass = password.toCharArray();
					int checkLetter = 0;
					int checkNumber = 0;
					int checkSpecialChar = 0;
					
					//For LetterException
						for(int i=0;i<pass.length;i++){
							if(Character.isLetter(pass[i])){
								checkLetter = 1;
							}
						}
						if(checkLetter == 0){
							throw new LetterException(password);
						}
						
					// For NumberException
						for(int i=0;i<pass.length;i++){
							if(Character.isDigit(pass[i])){
								checkNumber = 1;
							}
						}
						if(checkNumber == 0){
							throw new NumberException(password);
						}
						
					// For SpecialCharException
						for(int i=0;i<pass.length;i++){
							if(pass[i] == '!' || pass[i] == '@' || pass[i] == '#'){
								checkSpecialChar = 1;
							}
						}
						if(checkSpecialChar == 0){
							throw new SpecialCharException(password);
						}
					
				System.out.println("Valid Passsword: " + password);
					
				} catch(LetterException e){
					System.out.println("Error:.. Invalid password Letter [a-zA-z] not found");
					System.out.println(e.toString());
				} catch (NumberException e) {
					System.out.println("Error:.. Invalid password Digit [0-9] not found");
					System.out.println(e.toString());
				} catch (SpecialCharException e) {
					System.out.println("Error:.. Invalid password Special Char !, @, # not found");
					System.out.println(e.toString());
				}
			}
	}

}

class NumberException extends Exception{
	String pass;
	NumberException(String pass){
		this.pass = pass;
	}
	public String toString(){
		return ("NumberException: " + pass);
	}
}

class LetterException extends Exception{
	String pass;
	LetterException(String pass){
		this.pass = pass;
	}
	public String toString(){
		return ("LetterException: " + pass);
	}
}

class SpecialCharException extends Exception{
	String pass;
	SpecialCharException(String pass){
		this.pass = pass;
	}
	public String toString(){
		return ("SpecialCharException: " + pass);
	}
}