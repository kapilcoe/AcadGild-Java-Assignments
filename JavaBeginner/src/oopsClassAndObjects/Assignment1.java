package oopsClassAndObjects;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		// to calculate square root and cube root of a number
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int x =	s.nextInt();
		
		System.out.println("The square root of the number is :"+ Math.sqrt(x));
		System.out.println("The cube root of the number is :"+ Math.cbrt(x));
	}

}
