package learingIfElse;
import java.util.Scanner;


public class FindNumberOfDaysInMonth {
	
	
	//public static void myDayOfMonth()
	public static void main(String[] args) 
	
	{
	Scanner MyScan = new Scanner(System.in);
	System.out.println("Enter Number of Month in between 1 to 12");
	int month =MyScan.nextInt();
	String monthDays="";
	
	switch (month)
	{
	case 1: monthDays="31 Days in January";
	break;
	case 2: monthDays="28 Days in February";
	break;
	case 3: monthDays="31 Days in March";
	break;
	case 4: monthDays="30 Days in April";
	break;
	case 5: monthDays="31 Days in May";
	break;
	case 6: monthDays="30 Days in June";
	break;
	case 7: monthDays="31 Days in July";
	break;
	case 8: monthDays="31 Days in Auguts";
	break;
	case 9: monthDays="30 Days in September";
	break;
	case 10: monthDays="31 Days in Octomber";
	break;
	case 11: monthDays="30 Days in November";
	break;
	case 12: monthDays="31 Days in December";
	break;
	}
	System.out.println(monthDays);
	
	}	
	
}


	
