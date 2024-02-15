import java.util.Scanner;

public class InvertedEquilateralTriangle {

	public static void main(String[] args) 
	{
		// creating a object of Scanner class
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n = scan.nextInt();
		// To print rows
		for(int i=n ; i>=1 ; i--) {
			// To print n spaces in every row
			for(int space=1 ; space<=n-i+1 ; space++){
				System.out.print(" ");
			}

			// To print no of  stars in every row
			for(int j=1 ; j<=2*i-1 ; j++)
			{
				if( i==n ||j==1 || j==2*i-1 )
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
