package com.learn.strings.reversepositionstring;

public class ReversePositionString 
{
	public static void reversePosition(String str)
	{
		String[] rev = str.split(" ");
		for(String x:rev)
		{
			String newstr = "";
			// traversing on each word from last index
			for(int i=x.length()-1;i>=0;i--)
			{
				newstr +=x.charAt(i)+" ";
			}
			System.out.println(newstr);
		}
	}

}
