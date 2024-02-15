package com.learn.string.convertlowertoupper;

public class ConvertLowerToUpperCase 
{
	public static void convertLowerToUpper(String str)
	{
		char[]arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a'&& arr[i]<='z')
			{
				arr[i]=(char)(arr[i]-32);
			}
		}
		System.out.println(arr);
	}

}
