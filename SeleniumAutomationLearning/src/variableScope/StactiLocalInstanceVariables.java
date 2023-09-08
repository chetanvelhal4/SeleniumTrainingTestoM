package variableScope;

public class StactiLocalInstanceVariables {

	// instance variables
	int i =10,j=12,k,t; 
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//static 
		StactiLocalInstanceVariables.divide();
		
		StactiLocalInstanceVariables w = new StactiLocalInstanceVariables();
		w.addition();
		w.multiplication();
	}
	
	public void addition()
	{
		k= i+j;
		System.out.println(k);
	}
	
	public void multiplication()
	{
		int r = 2; // local variabels
		int l= 3;
		t = r*l;
		System.out.println(t);
		
	}
	
	public static void divide()
	{
		int u= 18;
		int s = 2;
		int answer = u/s;
		System.out.println(answer);
				
	}

}
