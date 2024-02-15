package com.learn.string.countuppercaseandlowercaseletters;

public class CountUppercaseAndLower 
{
	public static void countUpperandLowerCase(String str)
	{
		int count =0;
		char[]arr = str.toCharArray();
		for (int i=0;i<arr.length;i++) {
            if (arr[i]>='A'&& arr[i]>='Z') {
                count++;
            }
        }
       System.out.println("UpperCase count : "+count);
	}
	public static void countLowerCase(String str)
	{ 
		   int count =0;
		   char[]arr = str.toCharArray();
			for (int i=0;i<arr.length;i++) {
	            if (arr[i]>='a'&& arr[i]>='a') {
           
                   count++;
               }
           }
           System.out.println("LowerCase count : "+count);
	}
}


