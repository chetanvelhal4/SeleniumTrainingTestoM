package learingIfElse;


import java.util.Scanner;



public class ProgramOne {

	//Take three numbers from the user and print the greatest number ?
	
	public static void main(String[] args) 
	{
		
		//Take input from user for 
		
				Scanner scan = new Scanner(System.in);
		        System.out.println("Enter First number");
		        int a = scan.nextInt();
		        
		        System.out.println("Enter Second number");
		        int b = scan.nextInt();
		        
		        System.out.println("Enter Third number");
		        int C = scan.nextInt();
		        
		       if (a>b)
		       {
		    	   System.out.println("First Number is Greater" );
		       }else if (b>C)
		       {
		    	   System.out.println("Second Number is Greater");
		       }else if (C>a)
		       {
		    	   System.out.println("Thired Number is Greater");
		       }
		      
	}
	
}
