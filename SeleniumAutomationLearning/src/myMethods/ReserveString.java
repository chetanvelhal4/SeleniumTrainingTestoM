package myMethods;

import java.util.Scanner;

public class ReserveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReserveString a = new ReserveString();
		a.getString();
	}

	public void getString() {
		Scanner Givestring = new Scanner(System.in);
		System.out.println("Enter String");
		String mstring = Givestring.next();
		int k = mstring.length();
		System.out.println("lenght of string is " + k);
		char ch[] = mstring.toCharArray();

		for (int i = k - 1; i >= 0; k--) {
			// System.out.println(i);
			System.err.print(ch[i]);

			i--;

		}

	}
}
