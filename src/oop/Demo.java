package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name +" is walking");
	}
	void eat(){
		System.out.println(name +" is eating");
	}
	void sleep(){
		System.out.println(name +" is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Abyss";
		person1.walk();
		Person person2 = new Person();
		person2.name = "Sanju";
		person2.sleep();
		/*String name = "Abyss";
		String email = "abyaby@abyss.com";
		String phone = "554536346";
		
		System.out.println(name);*/
		
		

	}

}
