package myMethods;

public class MethodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOne myobjMethodOne = new MethodOne();
		int temp = myobjMethodOne.sum(50, 40);
		System.out.println(temp);
		int temp2 = MethodOne.sum(10, 20, 30);
		System.out.println(temp2);

	}

	static int sum(int i, int j, int k) {
		return i + j + k;
	}

	int sum(int j, int k) {
		return j + k;
	}

}
