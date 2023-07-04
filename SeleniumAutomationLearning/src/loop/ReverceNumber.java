package loop;
import java.util.Scanner;
public class ReverceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner myNum = new Scanner(System.in);
	System.out.println("Enter any number to reverse");
	int r = myNum.nextInt();
	int reverse = 0;
	while(r!=0)
	{
		int myremind = r %10;
		reverse = reverse*10+myremind;
		r= r/10;
		
	}
	System.out.println("Reversed Number is " + reverse);
		

	}

}

