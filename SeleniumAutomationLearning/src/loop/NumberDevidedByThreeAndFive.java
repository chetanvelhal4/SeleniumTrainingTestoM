package loop;

public class NumberDevidedByThreeAndFive {

	public static void main(String[] args) {
		// Number divisible by three

		int a = 100, b = 3;
		System.out.println();
		System.out.println("Numbers divsible by 3");
		for (int i = 1; i < a; i++) {
			int c = i % b;

			if (c == 0) {
				System.out.print(" " + i);
			}
		}
		NumberDevidedByThreeAndFive obj1 = new NumberDevidedByThreeAndFive();
		obj1.DivisibleByFive();
		obj1.DivisibleByBoth();
	}

	public void DivisibleByFive() {
		int a = 100, b = 5;
		System.out.println();
		System.out.println("Numbers divsible by 5 ");
		for (int i = 1; i < a; i++) {
			int c = i % b;
			if (c == 0) {
				System.out.print(" " + i);
			}
		}
	}

	public void DivisibleByBoth() {
		int a = 100, b = 5, d = 3;
		System.out.println();
		System.out.println("Numbers divsible by 3 and 5 both");
		for (int i = 1; i < a; i++) {
			int c = i % b;
			int f = i % d;
			if (c == 0 && f == 0) {
				System.out.print(" " + i);
			}

		}

	}

}
