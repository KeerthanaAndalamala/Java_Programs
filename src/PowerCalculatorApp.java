import java.util.Scanner;

public class PowerCalculatorApp {

	public static void main(String[] args) 
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a base");
		// Reading a character and storing in variable n
		int base = scan.nextInt();
		//Asking the user input
	    System.out.println("Enter a exponent");
		// Reading a character and storing in variable n
		int exponent = scan.nextInt();
		// Invoking a class name with method name
		System.out.println(PowerCalculator.powerCalculator(base,exponent));
		
		
		
	}

}
