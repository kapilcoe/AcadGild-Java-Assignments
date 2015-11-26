package oopsClassAndObjects;

public class Assignment3 {

	public static void main(String[] args) {
		//Print reverse of an array
		int [] array= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[array.length-i-1]);
		}
	}
}
