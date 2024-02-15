package com.kodNest;

import java.util.Scanner;

public class CopyAnElements {

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
		
		// invoking a method
		CopyArray(arr);
	}
	
	public static void CopyArray(int[] arr)
	{
		// creating and storing an array
		int a[] = new int[arr.length];
		for(int i=0;i<=arr.length-1 ; i++)
		{
			a[i]=arr[i];
		}
		System.out.print("The copied elements :");
		// Displaying the elements in array
		for(int i=0;i<=a.length-1 ; i++)
		{
			System.out.println(a[i]+"");
		}
	}




		}
