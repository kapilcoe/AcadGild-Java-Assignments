/*Handle NumberFormat Exception. For example the statement int num=Integer.parseInt ("XYZ");
would throw NumberFormatException because String XYZ cannot be parsed to int. So handle it.*/

package abstractInterfaceExceptionHandling;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		String number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = s.nextLine();
		s.close();
		try{
			System.out.println("The number entered by you is :" + Integer.parseInt(number));
		}
		catch(Exception e){
			System.out.println("Please enter a valid number!!!");
		}
	}
}
