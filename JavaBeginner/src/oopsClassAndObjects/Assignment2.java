package oopsClassAndObjects;

import java.util.Scanner;

class Prime{
	public static boolean isPrime(int x){
		if(x==1){
			return false;
		}
		if(x==2){
			return true;
		}
		int n=1;
		while(n<=x/2){
			n++;
			if(x%n==0){
				return false;
			}
			if(n>x/2){
				return true;
			}
		}
		
		return false;
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		//to check whether a given number is prime or not
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int x =	s.nextInt();
		if(Prime.isPrime(x)){
			System.out.println("Number is a Prime");
		}
		else{
			System.out.println("Number is not a Prime");
		}
		
	}
}
