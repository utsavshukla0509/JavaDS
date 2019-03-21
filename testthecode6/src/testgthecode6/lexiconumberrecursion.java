package testgthecode6;

import java.util.Scanner;

public class lexiconumberrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(0 + " ");
		test(n, 1);
	}

	public static void test(int n, int k) {
		if (k > n) {
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (k <= n) {
				System.out.print(k + " ");
			}
			k *= 10;
			test(n, k);
			k /= 10;
			k++;
			if (k % 10 == 0) {
				return;
			}
		}
	}
}
