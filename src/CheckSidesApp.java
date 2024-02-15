import java.util.Scanner;

public class CheckSidesApp {

	public static void main(String[] args) 
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a length");
		// Reading a character and storing in variable a
		int length  = scan.nextInt();
		//Asking the user input
	    System.out.println("Enter a breadth");
		// Reading a character and storing in variable a
		int breadth = scan.nextInt();
		// creating a reference variable with class
		CheckSides a = new CheckSides();
		// Invoking a class name with method name
		a.checkSide(length,breadth);
		

	}

}
