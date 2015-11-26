package ControlStatements;

public class Assignment3 {
public static void main(String[] args) {
	// print pattern
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		System.out.println("\n");
	}
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=5-i;k++){
			System.out.print(k);
		}
		System.out.println("\n");
	}

}
}
