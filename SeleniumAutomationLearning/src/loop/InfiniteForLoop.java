package loop;

public class InfiniteForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InfiniteForLoop newobj = new InfiniteForLoop();
		newobj.two();
		for (;;) {

			System.out.println("Hello");
		}

	}

	public void two() {

		for (int i = 1; i < 5;) {
			System.out.println(i);
		}
	}

}
