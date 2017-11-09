package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alpha = {"a","b","c","d"};
		System.out.println("Old way");
		for(int i = 0;i <= 3;i++){
			System.out.print(alpha[i] + " ");
		}
		System.out.println("\nUsing length");
		
		
		for(int n =0;n < alpha.length;n++){
			System.out.print(alpha[n] + " ");
		}
		
		System.out.println("\nUsinf for-each");
		for(String letter : alpha){
			System.out.print(letter + " ");
		}
		
		String[][] user = {	{"One","one","one@one.com","1234567"},
							{"Two","two","two@two.com","111111"},
							{"Three","three","three@three.com","11111"}
						   };
		int noOfUsers = user.length;
		int infoOfUsersNo  = user[0].length;
		System.out.println("\n" + noOfUsers);
		System.out.println(infoOfUsersNo);
		
		for(int i = 0;i<noOfUsers;i++){
			
				String firstName = user[i][0];
				String lastName = user[i][1];
				String email = user[i][2];
				String phoneNumber = user[i][3];
				System.out.println("Person "+ (i+1) +"th info: Name: " + firstName +" "+ lastName +"\nEmail: " + email +"\nPhone Number: " + phoneNumber);
			
		}
		
		
		for(String[] oneUser : user){
			System.out.println("First name: " + oneUser[0]);
			System.out.println("Second Name: " + oneUser[1]);
			System.out.println("Email: " + oneUser[2]);
			System.out.println("Phone Number: " + oneUser[3]);
		}
		
		for(String[] outerEach : user){
			System.out.print("[ ");
			for(String innerEach : outerEach){
			System.out.print(innerEach + " ");
		}System.out.println(" ]");
			}
	}

}
