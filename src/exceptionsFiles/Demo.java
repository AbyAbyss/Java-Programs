package exceptionsFiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Starting");
		doMath(5,6);
		doMath(12,6);
		doMath(5,0);
		System.out.println("Ending");

	}
	public static void doMath(int a, int b){
		//int c = a/b;
		//System.out.println(c);
		System.out.println(answer(a,b));
	}
	
	public static double answer(int x, int y){
		return x/y;
	}
}
