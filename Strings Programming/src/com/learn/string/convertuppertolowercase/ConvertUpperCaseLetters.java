package com.learn.string.convertuppertolowercase;

public class ConvertUpperCaseLetters 
{
	public static void convertUpperCase(String s1)
	{
		char[]arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A'&&arr[i]<='Z')
			{
				arr[i]=(char)(arr[i]+32);
			}
		}
		System.out.println(arr);
	}

}
