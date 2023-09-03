package myMethods;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapitalLetter m = new CapitalLetter();
		m.getsetence();
	}

	public void getsetence() {
		Scanner M = new Scanner(System.in);
		System.out.println("Please Enter any Sentence:->");
		String MySentence = M.nextLine();
		char ch[] = MySentence.toCharArray();

		int k = ch.length;
		System.out.println("lenght is " + k);
		int r =0;
		int t=0 ;
		for (int i = 0; i <= k - 1; i++) {
			// System.out.print(ch[i]);

			
			if (ch[i] == ' ') {

				r = i;
				t = r + 1;

			}

			if (i != r && i != t)

			{
				System.out.print(ch[i]);
				//System.out.println("value of r is ->" + r);

			} else if (i == r && i == r) {

				// System.out.println("value of i"+i);
				// System.out.println("value of t"+t);
				
				System.out.print( Character.toUpperCase(ch[i]));
				System.out.print( Character.toUpperCase(ch[t]));

			}

		}

	}
}
