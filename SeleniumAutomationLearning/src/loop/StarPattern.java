package loop;

public class StarPattern {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Program 1");
		// TODO Auto-generated method stub
		StarPattern newobj1 = new StarPattern();

		int a = 5, j = 5;
		for (int i = 1; i <= a; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		newobj1.patterntwo();
		newobj1.patternThree();
		newobj1.patternFour();
		newobj1.patternfive();
		newobj1.patternSix();
		newobj1.patternSeven();
		newobj1.patternEight();
		newobj1.patternNine();
		newobj1.patternTen();
		newobj1.patternEleven();
		newobj1.patternTwelve();
		newobj1.patterhThirteen();
		newobj1.patternFourteen();
		newobj1.paternFifteen();
		newobj1.patternSixteen();
	}

	public void patterntwo() {
		System.out.println();
		System.out.println("Program 2");
		
		int a = 5, j = 4;
		for (int i = 1; i <= a; i++) {
			for (j = 5; j > i; j--) {

				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void patternThree() {
		System.out.println();
		System.out.println("Program 3");
		System.out.println();
		int a = 5, j = 5;
		for (int i = 1; i <= a; i++) {
			for (j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void patternFour()

	{
		System.out.println();
		System.out.println("Program 4");
		System.out.println();
		int a = 5, j = 4;
		for (int i = 1; i <= a; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (j = 5; j >= i; j--) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void patternfive() {
		System.out.println();
		System.out.println("Program 5");
		int row = 6;
		for (int i = 0; i < row; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= 2 * i - 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void patternSix() {
		System.out.println();
		System.out.println("Program 6");
		
		
		int row = 6;
		for (int i = 0; i < row; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 7; j >= 2 * i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void patternSeven() {
		System.out.println();
		System.out.println("Program 7");
		int row = 5;

		for (int i = 0; i < row; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= 2 * i - 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < row; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 7; j >= 2 * i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public void patternEight() {
		System.out.println();
		System.out.println("Program 8");
		int a = 4;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}
		int c = 5, j = 5;
		for (int i = 1; i <= c; i++) {
			for (j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void patternNine() {
		System.out.println();
		System.out.println("Program 9");
		int a = 4, j = 4;
		for (int i = 1; i <= a; i++) {
			for (j = 5; j > i; j--) {

				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		int x = 5, r = 4;
		for (int i = 1; i <= x; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (r = 5; r >= i; r--) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void patternTen() {
		System.out.println();
		System.out.println("Program 10");
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = 5; j > i; j--) {

				System.out.print(" ");
			}

			System.out.println("****");
		}
	}

	public void patternEleven() {
		System.out.println();
		System.out.println("Program 11");
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("****");
		}
	}

	public void patternTwelve() {
		System.out.println();
		System.out.println("Program 12");
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int r = 2; r <= 5; r++) {
			for (int u = 1; u <= r; u++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void patterhThirteen() {
		System.out.println();
		System.out.println("Program 13");
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 2; k <= 5; k++) {
			for (int r = 6; r > k; r--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void patternFourteen() {
		System.out.println();
		System.out.println("Program 14");
		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int l = 2; l <= a; l++) {
			for (int r = 5; r > l; r--) {
				System.out.print(" ");
			}
			for (int m = 1; m <= l; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void paternFifteen() {
		System.out.println();
		System.out.println("Program 15");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

	public void patternSixteen()
	
	{
		System.out.println();
		System.out.println("Program 16");
		for (int i = 1; i <= 5; i++) {
			for (int u = 5; u > i; u--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
