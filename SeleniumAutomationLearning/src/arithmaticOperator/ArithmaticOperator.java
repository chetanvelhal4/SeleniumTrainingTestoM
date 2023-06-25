package arithmaticOperator;

public  class ArithmaticOperator {
	
	public static void arithmaticCalculation()
	{
		int i = 10;
		int j = i++;
		System.out.println("Value of I "+i);
		System.out.println("Value of J "+j);
		
		
	}
	
	public static void arithmaticCalculationOne()
	{
		int i = 10;
			
		int j = i++ + i++ + --i + ++i + ++i; 
		System.out.println("Value of I "+i);
		System.out.println("Value of J "+j);
		
	}
	
	public static void arithmaticCalculationOTwo()
	{
		int i = 10;
		int j = i++;	
		
		System.out.println("Value of I "+i);
		System.out.println("Value of J "+j);
		
	}
	
	public static void arithmaticCalculationOThree()
	{
		int i = 10;
		int j = i++ + ++i;	
		
		System.out.println("Value of I "+i);
		System.out.println("Value of J "+j);
		
	}
	
	
}
