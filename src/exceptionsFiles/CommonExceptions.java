package exceptionsFiles;

public class CommonExceptions {

	public static void main(String[] args) {
		int a =5;
		int b =0;
		
		//try catch block
		try{
			
		int c = a/b;
		System.out.println(c);
		
		}catch (ArithmeticException e){
			System.out.println("Can not divide by zero ");
			System.out.println(e.toString());
		}
		
		
		String[] states = {"CA", "US", "AS", "BS"};
		
		for(int i = 0;i <= states.length;i++){
			try{
			System.out.println(states[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Exception");
				System.out.println(e.toString());
			}finally{
				System.out.println("Prints no matter what");
			}
		}
		System.out.println("Program Ended");
	}

}
