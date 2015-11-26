package ControlStatements;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		//print number of days in a month
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the month (1-12) : ");
		int x = s.nextInt();
		int days;
		if(x>12 || x <1){
			days = 0;
		}
		else if(x==2)
		{
			days=28;
		}
		else if((x<=6 && x%2==0) || (x>6 && x%2!=0)){
			days=30;
		}
		else
		{
			days=31;
		}
	
		switch(days)
		{
		case 28:{
			System.out.println("28 days");
			break;
		}
		case 30:{
			System.out.println("30 days");
			break;
		}
		
		case 31:{
			System.out.println("31 days");
			break;
		}
		default : System.out.println("Wrong input!!!");
		}
	}
}
