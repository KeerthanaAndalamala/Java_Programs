import java.util.Scanner;

public class RectangleAreaApp {

	public static void main(String[] args)
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a length");
		// Reading a character and storing in variable a
		double length  = scan.nextDouble();
		//Asking the user input
	    System.out.println("Enter a breadth");
		// Reading a character and storing in variable a
		double breadth = scan.nextDouble();
		// Invoking a class name with method name
		System.out.println(RectangleArea.calculateRectangleArea(length, breadth));
		
	}

}
