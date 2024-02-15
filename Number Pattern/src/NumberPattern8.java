import java.util.Scanner;

public class NumberPattern8 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n = scan.nextInt();
		// To print rows
		int count=n*n;
		for(int i=1 ; i<=n; i++) 
		{
			for(int j=1 ; j<=n ; j++) 
			{	
				if(count<=9) {
					System.out.print("0"+count+" ");
					
				}
				else
				{
					System.out.print(count+" ");
				}
				count--;
				
			}
			System.out.println();
		}
		

	}

}
