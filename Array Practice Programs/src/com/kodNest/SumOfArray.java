package com.kodNest;
import java.util.Scanner;
public class SumOfArray {

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
		displaySum(arr);
	}
	public static void displaySum(int[] arr) {
		
		int sum=0;
		// Displaying the sum
		for(int i=0; i<=arr.length-1 ; i++)
		{
			// sum
			sum+=arr[i];
		}
		System.out.print("Sum : "+sum);
		
		

	}

}
