package com.kodNest;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) 
	{
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking a user from input
		System.out.print("Enter the no of rows : ");
		// Reading and storing a variable
		int row = scan.nextInt();
		// Asking a user from input
		System.out.print("Enter the no of columns : ");
		// Reading and storing a variable
		int col = scan.nextInt();
	
		
		// creating a 2D array
		int arr[][] = new int [row][col];
		// Asking the user enter the elements 
		System.out.println("Enter the elements in matrix are : ");
		
		// storing the elements in array
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				
				arr[i][j]=scan.nextInt();
			}
		}
		int diagonalprimarysum=0;
		int diagonalSecondarysum=0;
		for (int i = 0; i < arr.length; i++) {
			diagonalprimarysum += arr[i][i];
			diagonalSecondarysum += arr[i][arr.length- 1 - i];
        }
		// print the matrix elements
		System.out.println("Matrix:");
		// displaying the array elements
		for(int i=0; i<=arr.length-1 ; i++)
		{
			for(int j=0 ; j<=arr[i].length-1 ; j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of the elements in the primary diagonal: " + diagonalprimarysum);
        System.out.println("Sum of the elements in the secondary diagonal:" + diagonalSecondarysum);
		

	}

}
