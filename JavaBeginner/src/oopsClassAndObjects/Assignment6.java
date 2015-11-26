package oopsClassAndObjects;

class Demo{
	static int count;

	public Demo() {
		count++;
	}
}
public class Assignment6 {
public static void main(String[] args) {
	//count number of object of a class
	Demo obj1= new Demo();
	Demo obj2= new Demo();
	Demo obj3= new Demo();
	Demo obj4= new Demo();
	Demo obj5= new Demo();
	Demo obj6= new Demo();
	
	System.out.println("Total objects of class Demo created :"+ Demo.count);

}
	
}
