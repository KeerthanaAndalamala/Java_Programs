package com.kodNest;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args)
	{
		// creating a object of scanner class 
		Scanner scan =new Scanner(System.in);
		// Asking a user input from user
		System.out.print("Enter a size of an array : ");
		// Reading a character and storing a variable 
		int size = scan.nextInt();
		// Asking a user input from user
		System.out.print("Enter the first array elements : ");
		// create an array
		int []arr = new int[size];
		// loop for first array elements
		for(int i=0; i<=arr.length-1 ; i++)
		{
			// storing a array data
			arr[i]=scan.nextInt();
		}
		
		
		System.out.print("Enter the second array elements : ");
		// create an array
		int []arr1 = new int[size];
		// loop for first array elements

		for(int i=0; i<=arr1.length-1 ; i++)
		{
			// storing a arr1 data
			arr1[i]=scan.nextInt();
		}
		// calling a method
		addArray(arr,arr1);
		
	}
	public static void addArray(int []arr,int []arr1) {
		int arr2[] = new int[arr.length+arr1.length];// create an array
		
		for(int i=0 ; i<=arr.length-1 ; i++) {
			arr2[i]=arr[i]+arr1[i];//add the elements and store in a variable
		}
		// displaying the data
		System.out.println("The corresponding index elements of two arrays : ");
		for(int i=0 ; i<=arr.length-1 ; i++) {
			System.out.print(arr2[i]+" "); // print the arr2 
		}

		
	}

}
