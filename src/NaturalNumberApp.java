import java.util.Scanner;

public class NaturalNumberApp {

	public static void main(String[] args) {
		
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n  = scan.nextInt();
		// Invoking a class name with method name
	    NaturalNumber.naturalNumber(n);

	}

}
