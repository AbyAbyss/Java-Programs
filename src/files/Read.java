package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		//1. Define the file
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\FileToRead.txt";
		String text = null;
		//@. Create file in java
		File file = new File(filename);
		
		//3. Open the file
		
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
