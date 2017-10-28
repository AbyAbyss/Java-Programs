package Basics;

public class Weather {
	public static void main(String args[]){
		int temperature = 65;
		String sunCondition = "Sunny";
		if (temperature > 80){
			System.out.println("Its pleasent wear shorts and t-shirt.");
		}
		else if (temperature > 60 && sunCondition == "Sunny"){
			System.out.println("It's a little cooler, wear a long sleeves and jean.");
			System.out.println("Wear a hat.");
		}
		else if(temperature >50 || sunCondition == "Overcast"){
			System.out.println("This is a cool day wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day stay back at home.");
		}
		System.out.println("EndOfProgram");
	}
}
