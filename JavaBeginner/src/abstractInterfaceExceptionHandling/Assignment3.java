/*Handle ArrayIndexOutOfBounds Exception. For example if array is having only 5 elements and
we are trying to display 7th element then it should throw exception.*/

package abstractInterfaceExceptionHandling;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x;
		int array[] ={10,9,8,7,6,5,4,3,2,1};
		System.out.print("Enter the index of array to get the element : ");
		x = s.nextInt();
		s.close();
		try{
			System.out.println(array[x]);
		}
		catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println("Please enter a non negative number less than 10");
		}
	}
}