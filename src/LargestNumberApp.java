import java.util.Scanner;

public class LargestNumberApp {

	public static void main(String[] args)
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter first number");
		// Reading a character and storing in variable a
		int a  = scan.nextInt();
		//Asking the user input
	    System.out.println("Enter second number");
		// Reading a character and storing in variable b
		int b  = scan.nextInt();
		//Asking the user input
	    System.out.println("Enter third number");
		// Reading a character and storing in variable c
		int c = scan.nextInt();
		// creating a reference variable with class
		LargestNumber l = new LargestNumber();
		// Invoking a class name with method name
		l.largestNumber(a,b,c);
		
		

		
	}

}
