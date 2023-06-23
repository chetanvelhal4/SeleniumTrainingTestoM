package learingIfElse;
import java.util.Scanner;
public class NumberNeagativeOrPositive {

	
	public static void FindNumberIsPositiveOrNegative()
	{
		Scanner mynumber = new Scanner(System.in);
		System.out.println("Enter Any number to check if it is positive or Negative");
		int a = mynumber.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is Positive");
			
		}else if (a<0)
		{
			System.out.println("Number is Negative");
			
		}else if (a==0)
		{
			System.out.println("You entered 0");
		}
	}
}
