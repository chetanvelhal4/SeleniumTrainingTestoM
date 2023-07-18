package loop;

public class ThreeInfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 5) {
			System.out.println(i);

		}
		
		ThreeInfiniteLoop myobj1= new ThreeInfiniteLoop();
		myobj1.second();
		myobj1.three();
	}

	public void second() {
		int i = 1;
		do {
			System.out.println("Hello");

		} while (i <= 5);

	}

	public void three() {
		int i = 1;

		for (i = 1; i < 5;) {
			System.out.println("Hey");
		}
	}

}
