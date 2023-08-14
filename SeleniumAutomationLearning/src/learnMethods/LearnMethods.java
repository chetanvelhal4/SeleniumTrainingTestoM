package learnMethods;

public class LearnMethods {

	
	
	
	int k = 0;
	public int Learn_Methods(int i, int j )
	{
		int k = i+j;
		return k ;
	}

	
	public static void main(String[] args) {
		
		LearnMethods myp = new LearnMethods();
		int sum = myp.Learn_Methods(10, 20);
		System.out.println(sum);
	}
}
