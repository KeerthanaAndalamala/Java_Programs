
public class LargestNumber
{
	public void largestNumber(int a, int b, int c)
	{
		// check whether the a>b && a<c is true
		if(a>b && a>c)
		{
			System.out.println(a+" is a largest number");
		}
		// check whether the b>a && b<c is true
		else if(b>a && b>c)
		{
			System.out.println(b +" is a largest number");
		}
		// check whether the c>b && c<a is true
		else if(c>a && c>b)
		{
			System.out.println(c+" is a largest number");
		}
		// otherwise print All are equal
		else
		{
			System.out.println("All are equal");
		}
	}

}
