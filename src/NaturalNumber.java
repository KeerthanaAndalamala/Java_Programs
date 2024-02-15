
public class NaturalNumber 
{
	public static void naturalNumber(int n)
	{
		int sum = 0;
		// loop for n
		for(int i=1; i<=n; i++)
		{
			// calculate the sum
			sum = sum+i;
			System.out.println(i);
		}
		System.out.println("sum = " + sum);
	}

}
