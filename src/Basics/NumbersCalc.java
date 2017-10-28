package Basics;

public class NumbersCalc {
	public static void main(String args[]){
		printName();
		int numA = 10;
		int numB = 20;
		addNumber(numA,numB);
		System.out.println("Multiply "+numA+" * "+numB +" = "+multiplyNumber(numA,numB));
	}
	static void printName(){
		System.out.println("MY name is Abyss");
	}
	static void addNumber(int numberA,int numberB){
		int sum = numberA + numberB;
		System.out.println("Sum of "+numberA+" + "+numberB +" = "+sum);
	}
	static int multiplyNumber(int numberA, int numberB){
		return numberA * numberB;
	}
}
