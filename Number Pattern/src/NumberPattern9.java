import java.util.Scanner;

public class NumberPattern9 {

	public static void main(String[] args) {
		 // creating a object of Scanner class
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n = scan.nextInt();
		int count=1;
		// To print rows
		for(int i=1 ; i<=n; i++) {
			// print columns
			for(int j=1; j<=i ; j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}


	}

}
