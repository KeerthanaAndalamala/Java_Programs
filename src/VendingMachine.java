
public class VendingMachine 
{
	public void productNumber(String code)
	{
		// switch expression
		switch(code)
		{
		case "P01" :
			System.out.println("Maggi");
			break;
		case "P02" :
			System.out.println("Cocola");
			break;
		case "P03" :
			System.out.println("Pepsi");
			break;
		case "P04" :
			System.out.println("Chocolates");
			break;
		case "P05" :
			System.out.println("Biscuits");
			break;
			// default case statement
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
