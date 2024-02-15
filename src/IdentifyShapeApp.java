import java.util.Scanner;

public class IdentifyShapeApp {

	public static void main(String[] args)
	{
		       //Creating a object of Scanner class
				Scanner scan = new Scanner(System.in);
				//Asking the user input
				System.out.println("Enter a side");
				// Reading a character and storing in variable a
				int sides = scan.nextInt();
				// creating a reference variable with class
				IdentifyShape a = new IdentifyShape();
				// Invoking a class name with method name
				a.typeofShape(sides);
						
				

	}

}
