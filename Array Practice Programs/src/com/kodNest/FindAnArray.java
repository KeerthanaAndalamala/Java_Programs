package com.kodNest;

import java.util.Scanner;

public class FindAnArray {

	public static void main(String[] args)
	{
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking a user from input
		System.out.print("Enter a size of an array : ");
		// Reading and storing a variable
		int size = scan.nextInt();
		
		// creating an array
		int []arr = new int[size];
		
		// storing the elements in array
		for(int i=0; i<=arr.length-1 ; i++)
		{
			arr[i]=scan.nextInt();
		}
		// Asking the user enter the key to be searched
		System.out.println("Enter an elements to be searched");
		int n = scan.nextInt();
		
		 // invoking a method
		 int res=LinearSearch(arr,n);
		 
		 // check if res is equal to 1
		 if(res==1) 
		 {
			 System.out.println("Element is found "+res);
		 }
		 // otherwise print Element is not found
		 else 
		 {
			 System.out.println("Element is not found");
		 }
	}
		public static int LinearSearch(int[] arr, int n)
		{
			// Displaying the elements in array
			for(int i=0;i<=arr.length-1 ; i++)
			{
			    // check the key is true
				if(n==arr[i]) 
				{
					return i;
					
				}
				
			}
			return-1;	

	}

}
