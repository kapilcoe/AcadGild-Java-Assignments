/*Defining an interface and its implementation in two different classes in different way. Define an
interface having one method that takes an integer parameter. For this method, provide two
implementations: In the first one, just print the value and in the second one, print the square of the
number. Try to call both the versions.*/

package abstractInterfaceExceptionHandling;

 interface TestInterface {

	void function(int x);
}

class First implements TestInterface{
	
	public void function(int x){
		System.out.println(x);
	}
}

class Second implements TestInterface
{
	public void function(int x){
		System.out.println(x*x);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		
		TestInterface obj = new First();
		obj.function(10);
		TestInterface object = new Second();
		object.function(10);
	}
}
