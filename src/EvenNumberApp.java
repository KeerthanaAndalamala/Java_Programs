import java.util.Scanner;

public class EvenNumberApp {

	public static void main(String[] args)
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n  = scan.nextInt();
		EvenNumber e = new EvenNumber();
		// Invoking a reference variable with method name
		e.evenNumbers(n);
	}

}
