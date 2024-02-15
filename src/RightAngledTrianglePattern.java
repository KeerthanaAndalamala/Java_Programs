import java.util.Scanner;

public class RightAngledTrianglePattern {

	public static void main(String[] args) 
	{
		// creating a object of Scanner class
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n = scan.nextInt();
		// To print rows
		for(int i=1 ; i<=n ; i++) {
			// To print n spaces in every row
			for(int space=i ; space<=n ; space++){
				System.out.print(" ");
			}

			// To print no of  stars in every row
			for(int j=1 ; j<=i ; j++)
			{
				if(j==1 || j==i || i==n)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			// To send cursor to next line
			System.out.println();
		}
		

	}

}
