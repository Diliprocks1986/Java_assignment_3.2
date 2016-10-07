// Java statement to assign the value true to the boolean variable same , when the String variable S1 has the same contents as the String variable S2 , and false otherwise

import java.util.Scanner;

public class Bool{
	
	
	public static void main(String[] args){
		// assigned boolean variable same
		boolean same;
		// Scanner objects for taking Strin value
		Scanner inputs = new Scanner(System.in);  
		// Prompting user For String Value in runtime
		System.out.println("Enter First String");
		// saving the scanner value to S1
		String S1 = inputs.nextLine();
		// Prompting user For String Value in runtime
		System.out.println("Enter Second String");
		// saving the scanner value to S2
		String S2 = inputs.nextLine();
		// compairing two String by the help of equals() method of String Datatype.
		same = S1.equals(S2);
		// printing the result after comparison
		System.out.println(same);
	
		
	}
}