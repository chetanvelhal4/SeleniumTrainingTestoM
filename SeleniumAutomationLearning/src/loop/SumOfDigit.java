package loop;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter Number to do Sum of Digits");
			int i = myscan.nextInt();
			int temp = i;
			int sum = 0;
			while ( i!=0)
			{
				sum = sum + i%10;
				i=i/10;
				
			}
			System.out.println("Sum of "+ " " +temp +" is " + sum );
		}

	}

}
