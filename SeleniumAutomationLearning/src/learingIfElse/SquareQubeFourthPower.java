package learingIfElse;
import java.util.Scanner;
public class SquareQubeFourthPower {

	//public void mySquareQubeFourthPower()
	public static void main(String[] args) 
	{
			
		Scanner mynumber = new Scanner(System.in);
		System.out.println("Enter Number to get Sqaure cure and foruth power");
		int a = mynumber.nextInt();
		int mysquare = a*a;
		int myqube = a*a*a;
		int myforthpower = a*a*a*a;
		
		System.out.println("Square of Given number is " + mysquare);
		System.out.println("Qube of Given number is " + myqube);
		System.out.println("Forth power of given number is " + myforthpower );
		
		mynumber.close();
		
				
		
	}
}
