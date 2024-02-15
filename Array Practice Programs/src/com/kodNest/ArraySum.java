package com.kodNest;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) 
	{
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking input from user
		System.out.print("Enter the no of rows : ");
		// Reading a character and storing in a variable 
		int row = scan.nextInt();
		// Asking input from user
		System.out.print("Enter the no of columns : ");
		// Reading a character and storing in a variable 
		int col = scan.nextInt();
		
		// creating a 2D array
		int arr[][] = new int [row][col];
		
		// Storing the elements 
		System.out.println("Enter the  elements in matrix are : ");
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				
				arr[i][j]=scan.nextInt();
				
				
			}
		}
		int sum=0;
		// displaying the elements
		for(int i=0; i<=arr.length-1 ; i++)
		{
			sum=0;
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				
				sum+=arr[i][j];
			}
			System.out.println("The sum of  elements: "+sum);

		}
		

	}

}
