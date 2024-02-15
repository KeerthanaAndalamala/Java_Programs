
public class IdentifyShape 
{
	public void typeofShape(int sides)
	{
		// switch expression
		switch(sides)
		{
		case 1 :
			System.out.println("Line");
			break;
		case 2:
			System.out.println("Rectangle");
			break;
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Square");
			break;
		case 5:
			System.out.println("Polygon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		case 9:
			System.out.println("Nanogon");
			break;
		case 10:
			System.out.println("Decagon");
			break;
			// default case statement
		default:
			System.out.println("Invalid input");
				
		}
	}

}
