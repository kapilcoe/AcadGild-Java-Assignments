package ControlStatements;

import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age :");
		int x = s.nextInt();
		
		if(x>=18){
			System.out.println("Congratulations!!! You are eligible to vote");
		}
		else{
			System.out.println("Sorry!!! Have patient till you turn 18...");
		}
	}
	
	
}