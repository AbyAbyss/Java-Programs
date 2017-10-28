package Basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle = "Some book 1";
		
		//.CONTAINS
		if (bookTitle.contains("book")){
			System.out.println("It is a book");
		}
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The brower is chrome");
		}
		
		String firstName = "Aby";
		String secondName = "Abyss";
		String SSN = "9876543210";
		System.out.print(firstName.substring(0,1));
		System.out.print(secondName.substring(0,1));
		System.out.print(SSN.substring(5));
	}
	

}
