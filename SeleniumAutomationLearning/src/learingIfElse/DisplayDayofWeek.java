package learingIfElse;
import java.util.Scanner;

public class DisplayDayofWeek {
	
	public static void mydayofweek()
	{
		Scanner scanday = new Scanner(System.in);
		System.out.println("Please provide nuber to find day between 1 to 7 ");
		int a = scanday.nextInt();
		
		if (a==1)
		{
			System.out.println("Today is Monday");
		}else if (a ==2)
		{
			System.out.println("Today is Tuesday");
			
		}else if (a==3)
		{
			System.out.println("Today is Wedensday");
		}else if (a==4)
		{
			System.out.println("Today is Thursday");
		}else if (a==5)
		{
			System.out.println("Today is Friday");
		}else if (a==6)
		{
			System.out.println("Today is Saturday");
		}else if (a==7)
		{
			System.out.println("Today is Sunday ");
		}else if (a>7)
		{
			System.out.println("Entered number is not in between 1 to 7");
		} 
	}

}
