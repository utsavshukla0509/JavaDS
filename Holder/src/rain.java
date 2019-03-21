import java.util.Scanner;

public class rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] ans = new int[n1];
		for (int j = 0; j < n1; j++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(rain(arr));
		}

	}

	public static int rain(int[] arr) {
		int[] arr1 = new int[arr.length];
		int lmax = arr[0];
		int rmax = arr[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] <= arr[i]) {
				arr1[i] = lmax;
			} else {
				lmax = arr[i];
				arr[i] = lmax;
			}
		}
		return 0;
	}

}
