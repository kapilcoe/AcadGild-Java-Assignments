package ControlStatements;

public class Assignment2 {
public static void main(String[] args) {
	
	//To print prime numbers between 1 to 100
	System.out.println("1: not a prime number ");
	System.out.println("2: is a prime number");
	System.out.println("3: is a prime number");
	int[] array =  new int[10];
	int n;
	for(int i=4 ; i<=100 ;i++)
	{
		n=2;
		while (n<=i/2){
			if(i%n==0)
			{
				System.out.println( i + ": not a prime number");
				break;
			}
			
			if(n==i/2){
				System.out.println(i + ": is a prime number");
			}
			
			n++;
		}
	}
}
}
