package com.learn.strings.reversesubstring;

public class ReverseSubString {
	public static void reverseSubString(String str)
	{
		// converting the strings into char type array
		char[] arr = str.toCharArray();
		// Traversing a string
		for(int i=arr.length-1;i>=0;i--)
		{
			// create a new string store the empty string
			String newstr = "";
			// Traversing a string
			for(int j=i;j<arr.length;j++)
			{
				// Concatenate the new string with arr[j]
				newstr+=arr[j];
				System.out.println(newstr);
			}
		}
	}

}
