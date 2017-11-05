package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//1. Find the file
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\FileToWrite.txt";
		String message = "I am write data to a file";
		String text = null;
		
		//2. create the file in java
		File file = new File(filename);
		
		
		
		try {
			//3. open the file
			FileWriter fw = new FileWriter(file);
			
			//4. write the file
			fw.write(message);
			
			//5. close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR...cannot write to file " + filename);
			e.printStackTrace();
		} finally{
			System.out.println("Closing the filewriter\n\n");
		}
		
		//Opening and reading the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//4. Read the file
			text = br.readLine();
			
			
			//5. Close recourses
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR...file not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR..could not read file " + filename);
			e.printStackTrace();
		} finally{
			System.out.println("Finish reading file");
		}
		System.out.println(text);
		

	}

}
