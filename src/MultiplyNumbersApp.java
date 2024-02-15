import java.util.Scanner;
public class MultiplyNumbersApp {

	public static void main(String[] args)
	{
		//Creating a object of Scanner class
	        Scanner scan = new Scanner(System.in);
		//Asking the user input
	        System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int num  = scan.nextInt();
		// creating a reference variable with class name
		MultiplyNumbers a = new MultiplyNumbers();
		// Invoking a reference variable with method name
		a.multiplyNumber(num);

	}

}
