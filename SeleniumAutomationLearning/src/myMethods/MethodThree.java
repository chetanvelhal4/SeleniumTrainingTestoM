package myMethods;

public class MethodThree {

	public static void main(String[] args) {

	int tempsalary =	MethodThree.TotalSalary(2500);
	System.out.println(tempsalary);
		
	}

	public  static int TotalSalary(int Salary)
	{
		MethodThree nt = new MethodThree();
		int bns = nt.bonus();
		int EmpSalary = Salary + bns;
		return EmpSalary;
	}
	
	public  int  bonus(){

		int mybonus = 1000;
		return mybonus;

	}
}