package com.kodNest;

import java.util.Scanner;

public class ArrayMatrix {

	public static void main(String[] args) 
	{
		// creating a object of scanner class 
		Scanner scan =new Scanner(System.in);
		// Asking a user input from user
		System.out.print("Enter the no of rows : ");
		// Reading a character and storing a variable 
		int row = scan.nextInt();
		// Asking a user input from user
		System.out.print("Enter the no of columns : ");
		// Reading a character and storing a variable 
		int col = scan.nextInt();
		
		
		// creating a 2D array
		int arr[][] = new int [row][col];
		
		
		System.out.println("Enter the  elements in matrix are : ");
		// loop for first array elements
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				// storing a array data
				arr[i][j]=scan.nextInt();	
			}
		}
		// displaying the data
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				// display the matrix elements
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}


	}

}
