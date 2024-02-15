package com.kodNest;

import java.util.Scanner;

public class MergeAnArray {

	public static void main(String[] args) 
	{
		// creating a object of scanner class
		Scanner scan =new Scanner(System.in);
		// Asking a user from input
		System.out.print("Enter a size of an array : ");
		// Reading and storing a variable
		int size = scan.nextInt();
		
		// Asking a user input
		System.out.print("Enter the first array elements : ");
		
		// creating an array
		int []arr = new int[size];
		
		// storing the 1st array elements
		for(int i=0; i<=arr.length-1 ; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		// Asking a user enter the second array element
		System.out.print("Enter the second array elements : ");
		
		// creating an array
		int []arr1 = new int[size];
		
		// storing the 2nd array elements 
		for(int i=0; i<=arr1.length-1 ; i++)
		{
			arr1[i]=scan.nextInt();
		}
		// invoking a method
		MergeArray(arr,arr1);
	}

	
	public static void MergeArray(int[] arr,int []arr1)
	{
		// creating and storing a length of 2 array elements
		int []arr2 = new int[arr.length+arr1.length];
		
		// loop for first array elements
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			
			arr2[i]=arr[i];
		}
		for(int i=0 ; i<=arr1.length-1 ; i++)
		{
			arr2[arr.length+i]=arr1[i];
		}	
		System.out.print("The merged an array elements : ");
		
		// Displaying the elements in array
		for(int i=0 ; i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
