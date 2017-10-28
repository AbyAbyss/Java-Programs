package Basics;

public class FibonnaicApp {

	public static void main(String[] args) {
	System.out.println(sum(10));	
fib(5);
int[] arr = {2,3,5,3,7};
System.out.println(avgNumber(arr));
	}
	 public static int sum(int n){
		int result = 0;
		for(int i = 1;i <=n;i++){

		result = result + i;
		}
		return result;
		}
	 public static double avgNumber(int[] arr){
		 double result = 0;
		 for(int n = 0;n < arr.length;n++){

		 result = result + arr[n];
		 }
		 return (result/arr.length);
		 }
	 
	public static void fib(int n){
		/*if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		return ((fib(n-1)) + (fib(n-2)));*/
		
		//for series
		int init = 0;
		int first = 1;
		int result = 1;
		//int second = 1;
		System.out.print(init+" ");
		//if(n>=0){
			//System.out.print(init);
		for(int i = 1;i < n;i++){
			System.out.print(result+" ");
			result = init + first;
			 init = first;
			 first = result;
			//System.out.print(result+" ");
		//}
		}
	}
}
