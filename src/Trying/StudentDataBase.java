package Trying;

public class StudentDataBase {

	public static void main(String[] args) {
		Student stu1 = new Student("Aby", "123456789");
		//Student stu2 = new Student("Sanju", "987654321");
		//Student stu3 = new Student("Sanju", "987654321");
		
		stu1.enroll("Math1");
		stu1.enroll("English");
		stu1.checkBalance();
		stu1.showCourse();
		System.out.println(stu1.toString());
		
		
		
		Student stu2 = new Student("Sanju", "987654321");
		stu2.enroll("CSS");
		stu2.enroll("HTML");
		stu2.checkBalance();
		stu2.showCourse();
		System.out.println(stu2.toString());
		
	}

}

class Student{
	private String name;
	private String ssn;
	private String email;
	private static int ID = 10;
	private static String userId;
	private double balance = 0;
	private static final double bill = 800;
	private String course = "";
	private int numberOfCourses = 0;
	private String phone;
	private String city;
	private String state;	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student(String name, String ssn){
		ID++;
		this.name = name;
		this.ssn = ssn;
		System.out.println("Name: " + name + "\nssn: " + ssn);
		setEmail();
		setUserId();
	}
	
	private void setEmail(){
		email = name.toLowerCase()+ "." + ID + "@email.com";
		System.out.println(email);
	}
	
	private void setUserId(){
		int max= 9000, min = 1000;
		int random = (int) (Math.random() * (max - min));
		random = random + min;
		userId = ID + "" + random + ssn.substring(5);
		System.out.println(userId);
	}
	
	public void enroll(String course){
		this.course = this.course +"\n" +course; 
		numberOfCourses++;
		balance = balance + bill;
	}
	public void payBill(int amount){
		balance = balance - amount;
	}
	
public void checkBalance(){
	System.out.println("Balance: $" + balance);
}

public void showCourse(){
	System.out.println(course);
	
}

@Override
public String toString(){
	return "[ Name: " + name + " ]\n[ Email: " + email + " ]\n[ ID: " + ID + " ]\n[ UserID: " + userId + " ]\n[ SSN: " + ssn + " ]\n[ Total Courses: " + numberOfCourses + " ]\n[ Total Cost: " + balance + " ]";
}


	
}
