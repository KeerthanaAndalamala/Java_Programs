package com.learn.strings.countlettersnumbers;

public class CountLettersAndNumbers 
{
	public static void countLettersAndNumbers(String str)
	{
		int count=0 ,lowcount=0, numcount=0, speccount=0 ;
		String newstr = "" , lowstr = "", numstr = "", specstr="";
		char[]arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A'&& arr[i]<'Z')
			{
				count++;
				newstr=newstr+arr[i];
			}
			else if(arr[i]>='a'&& arr[i]<='z')
			{
				lowcount++;
				lowstr=lowstr+arr[i];
				
			}
			else if(arr[i]>='1'&& arr[i]<='9')
			{
				numcount++;
				numstr+=arr[i];
			}
			else 
			{
				speccount++;
				specstr+=arr[i];
			}
		}
		System.out.println("Count of Uppercase Letters: "+count);
		System.out.println("UpperCase Letters : "+newstr);
		System.out.println("Count of Uppercase Letters: "+lowcount);
		System.out.println("LowerCase Letters : "+lowstr);
		System.out.println("Count of numbers: "+numcount);
		System.out.println("Numbers: "+numstr);
		System.out.println("Count of special character: "+speccount);
		System.out.println("Special Characters :"+specstr);	
		
	}

}
