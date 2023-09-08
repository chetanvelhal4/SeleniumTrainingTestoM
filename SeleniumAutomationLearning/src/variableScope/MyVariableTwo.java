package variableScope;

public class MyVariableTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());
	}
	static int fun() {
		static int x= 0;
		return ++x;
	}
}
