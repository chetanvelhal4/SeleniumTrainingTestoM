package oopsConcept;

// inheritance example 

class Employee {

	float salary = 40000;

}

class Programmer extends Employee {
	int bonus = 10000;
	

	public static void main() {
		// TODO Auto-generated method stub

		Programmer p = new Programmer();

		int r = p.bonus;
		System.out.println("Salary is " + p.salary);
		System.out.println("Bonus is " + r);
		
	}

}
