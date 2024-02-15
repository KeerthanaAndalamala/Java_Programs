import java.util.Scanner;

public class VendingMachineApp {

	public static void main(String[] args) 
	{
		//Creating a object of Scanner class
	    Scanner scan = new Scanner(System.in);
		//Asking the user input
	    System.out.println("Enter a code");
		// Reading a character and storing in variable a
		String code  = scan.nextLine();
		// creating a reference variable with class
		VendingMachine b = new VendingMachine();
		// Invoking a class name with method name
		b.productNumber(code);

	}

}
