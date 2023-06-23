package programOutput;
import arithmaticOperator.ArithmaticOperator;
import learingIfElse.DisplayDayofWeek;
import learingIfElse.ProgramOne;

import java.util.Scanner;


public class MyOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmaticOperator myobj = new ArithmaticOperator();
		
		//Q - Arithmatic  Operator Solve the issue
		ArithmaticOperator.arithmaticCalculation();
		
		//Q - Arithmatic Operator Solve the issue
		ArithmaticOperator.arithmaticCalculationOne();
		
		//Q - Arithmatic Operator Solve the issue
		ArithmaticOperator.arithmaticCalculationOTwo();
		
		//Q - Arithmatic Operator Solve the issue
		ArithmaticOperator.arithmaticCalculationOThree();
		
		ProgramOne myobjone = new ProgramOne();
		myobjone.findGreatestNumber();
		
		DisplayDayofWeek myobjtwo = new DisplayDayofWeek();
		DisplayDayofWeek.mydayofweek();
	}

}
