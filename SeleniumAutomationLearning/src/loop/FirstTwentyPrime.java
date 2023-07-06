package loop;

public class FirstTwentyPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0, count = 0;
		int n = 2, i = 0, pr = 2;

		while (count <= 20) {
			for (i = 1; i <= n; i++) {

				if (n % i == 0) {
					cnt++;
					pr = n;

				}

			}
			if (cnt == 2) {

				System.out.println(pr);
				count++;
			}
			cnt = 0;
			n++;
		}
	}
}
