import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) 
	{
		//Creating a object of Scanner class
		Scanner scan = new Scanner(System.in);
		//Asking the user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable a
		int a  = scan.nextInt();
		// creating a reference variable with class
		Age x = new Age();
		// Invoking a reference variable with method name
		x.egilibleAge(a);
		
	}

}
