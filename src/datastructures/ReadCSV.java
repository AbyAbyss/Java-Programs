package datastructures;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "E:\\ABYSS\\PROGRAMMING\\JAVA\\udemy_course\\Files\\accounts.csv";
		//File file = new File(filename);
		String dataRow;
		try {
			// open file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read the data as long as its empty
			while((dataRow = br.readLine()) != null){
				String[] Line = dataRow.split(",");
				// adding data to collection
				data.add(Line);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for(String[] account : data){
			System.out.print("[ ");
			for(String field : account){
				System.out.print(field + " ");
			}
			System.out.println("]");
		}
		
	}

}
