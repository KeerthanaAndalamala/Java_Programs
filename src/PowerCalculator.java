
public class PowerCalculator 
{
	public static int powerCalculator(int base, int exponent)
	{
		int power = 1;
		// loop for exponent
		for(int i=1; i<=exponent; i++)
		{
			// calculate the power
			power = power*base;
		}
		// return power 
		return power;
		
		
	}

}
