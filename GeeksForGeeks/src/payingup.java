import java.util.Scanner;
import java.util.*;

public class payingup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			int k = s.nextInt();
			int[] arr = new int[a];
			for (int j = 0; j < a; j++) {
				arr[j] = s.nextInt();
			}

			generatesubsets(arr, a, k);

		}
	}

	public static int filterchars(int a[], int no) {

		int i = 0;
		int b = 0;

		while (no > 0) {

			if ((no & 1) != 0) {
				b += a[i];
			}

			i++;
			no = no >> 1;
		}
		int z = b;
		b = 0;
		return z;

	}

	public static void generatesubsets(int a[], int n, int k) {
		int x = (int) Math.pow(2, n);
		int j = 0;
		int ar1[] = new int[x];
		int range = (1 << n) - 1;
		for (int i = 0; i <= range; i++) {
			int w = filterchars(a, i);
			ar1[j] = w;
			j++;
		}
		int count = 0;
		for (int q = 0; q < x; q++) {
			if (ar1[q] == k) {
				count++;
			}

		}
		if (count != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
