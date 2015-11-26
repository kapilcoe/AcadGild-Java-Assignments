package oopsClassAndObjects;

class Person{
	String email;
	String name;
	String address;
	public Person(String email, String name, String address) {
		this.email = email;
		this.name = name;
		this.address = address;
	}
	
}
public class Assignment5 {

	public static void main(String[] args) {
		/*create class Person with (instance variable) fields like email, name,
		address and initialize through parameterized constructor and access
		fields in other class and print it*/
		Person myself = new Person("kapil.coe@gmail.com","Kapil","Delhi,India");
		System.out.println("Name :"+ myself.name);
		System.out.println("Email :"+ myself.email);
		System.out.println("Address :"+ myself.address);
		
		
	}
}
