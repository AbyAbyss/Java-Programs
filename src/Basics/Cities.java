package Basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and define array
		String[] cities = {"New York", "Bangalore", "Miami"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		
		//Declare the array
		String[] states = new String[5];
		states[0] = "Karnataka";
		states[1] = "Kerala";
		states[2] = "Karnataka12";
		states[3] = "Kerala1";
		states[4] = "Kerala12";
		int i = 0;
		do{
		System.out.println(states[i]);
		i = i + 1;
		}while(i<5);
		//Declare
		String[] countries;
		//Defining array
		countries = new String[2]; 
		
		countries[0] = "India";
		countries[1] = "China";
		System.out.println(countries[1]);
	}

}
