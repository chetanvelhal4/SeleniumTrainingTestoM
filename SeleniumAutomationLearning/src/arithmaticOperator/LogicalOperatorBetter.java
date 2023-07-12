package arithmaticOperator;

public class LogicalOperatorBetter {

	public  void mycompareone() {
		// TODO Auto-generated method stub
		
		int a = 10 ;
		int b = 5;
		int c = 20;
		System.out.println(a<b&&a<c);
		System.out.println(a<b&a<c);
		
		

	}
	public static void main(String[] args) 
	
	{
		int a = 10 ;
		int b = 5;
		int c = 20;
		System.out.println(a<b&&a++<c); // both condition not checked 
		System.out.println(a); // will get 10
		System.out.println(a<b&a++<c); // both condition checked 
		System.out.println(a); // will get 11
		
		LogicalOperatorBetter mylog = new LogicalOperatorBetter();
		mylog.mycompareone();
		mylog.mycomparetwo();
	}
	
	
		public  void mycomparetwo() 
		{
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a>b||a++<c); // both condition not checked 
		System.out.println(a);// will get 10
		System.out.println(a>b|a++<c);// both condition checked 
		System.out.println(a); // will get 11
		
		
	}

	
	
}
