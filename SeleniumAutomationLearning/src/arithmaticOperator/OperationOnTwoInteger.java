package arithmaticOperator;
import java.util.Scanner;
public class OperationOnTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner iscan = new Scanner(System.in);
		System.out.println("Enter First integer Number");
		int one = iscan.nextInt();

		Scanner iscantwo = new Scanner(System.in);
		System.out.println("Enter Second integer Number");
		int two = iscantwo.nextInt();
		
		int sum = one + two;
		System.out.println("Sum = " + sum );
		
		int mydiff = one - two;
		System.out.println("diff = " + mydiff );
		int myproduct = one * one ;
		System.out.println("Product = " + myproduct );
		int myavarage = sum / 2;
		System.out.println("Avarage = " + myavarage );
		int mydistance = one - two;
		System.out.println("Distance = " + mydistance );
		
		if (one>two)
		{
			System.out.println("Number" + one+"is bigger");
			System.out.println("Number" + two +"is smaller");
		}else if(two>one)
		{
			System.out.println("Number" + two + "is bigger");
			System.out.println("Number" + one + "is smaller");
		}
			
		
		
		
	}

}
