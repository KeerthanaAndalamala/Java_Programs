import java.util.Scanner;

public class NumberPattern12 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// Asking a user input
		System.out.println("Enter a number");
		// Reading a character and storing in variable n
		int n = scan.nextInt();
		// To print rows
		int count=1;
		for(int i=0 ; i<=n; i++) 
		{	
				if(i%2==0)
				{
					for(int j=0 ; j<=n ; j++) 
					{
					System.out.print(count+" ");
					count=count+2;
					}
			
				}
	
				else {
					for(int j = n - 1; j >= 0; j-- ) {
					System.out.print(count+" ");
					count=count+2;
					}
				}
				System.out.println();
			}
			   
		}
	
		
	}


