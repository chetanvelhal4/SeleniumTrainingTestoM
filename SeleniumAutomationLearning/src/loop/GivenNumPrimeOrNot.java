package loop;
import java.util.Scanner;
public class GivenNumPrimeOrNot {

	
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter number to check if given number is prime or not ");
		int r = myScan.nextInt();
		

			int n = r;

			boolean prime = true;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {

					prime = false;
					break;

				}

			}

			 System.out.println(prime );
			r++;
		}
	}
	

