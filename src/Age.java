
public class Age 
{
	public void egilibleAge(int a)
	{
		// check whether the a>=0 and a<=12
		if(a>=0 && a<=12)
		{
			System.out.println("Childage");
		}
		// check whether the a>=13 and a<=19
		else if(a>=13 && a<=19)
		{
			System.out.println("Teenage");
		}
		// check whether the a>=20 and a<=59
		else if(a>=20 && a<=59)
		{
			System.out.println("Adultage");
		}
		// Otherwise >=60 print senior citizen
		else
		{
			System.out.println("senior citizen");
		}
	}
	

}
