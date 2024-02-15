import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args)
	{
		       // creating a object of Scanner class
				Scanner scan = new Scanner(System.in);
				// Asking a user input
				System.out.println("Enter a number");
				// Reading a character and storing in variable n
				int n = scan.nextInt();
				// To print rows
				for(int i=1 ; i<=n; i++) {
					for(int j=1; j<=n ; j++)
					{
						System.out.print(j+ " ");
					}
					System.out.println();
				}

	}

}
