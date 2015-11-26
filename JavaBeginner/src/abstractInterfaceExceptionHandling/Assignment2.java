/*Create student result processing system with an abstract class. All years students data can be
entered and displayed by inherited sub classes. Abstract class should contain student roll, name
and registration number.*/

package abstractInterfaceExceptionHandling;

abstract class Student{
	String name;
	int std;
	int marks;
	char grade;
	
	Student(String name, int std, int marks)
	{
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	abstract void calculateGrade();
	
	void printInfo()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Standard:"+this.std);
		System.out.println("Marks:"+this.marks);
	}
	
}

class Info extends Student{
	
	Info(String name, int std, int marks) {
		super(name, std, marks);
		// TODO Auto-generated constructor stub
	}

	void calculateGrade(){
		if(marks>90){
			grade = 'A';
		}else{
			grade = 'B';
		}
	}
	
	void printInfo()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Standard:"+this.std);
		System.out.println("Marks:"+this.marks);
		System.out.println("Grade:"+this.grade);
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		Student obj1 = new Info ("kapil", 10, 95);
		obj1.calculateGrade();
		obj1.printInfo();
	}
}
