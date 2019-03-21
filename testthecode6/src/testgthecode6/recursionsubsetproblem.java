package testgthecode6;

import java.util.Scanner;

public class recursionsubsetproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int m = s.nextInt();
		print(0, m, arr, "");
		System.out.println(count);
		printsub(0, m, arr, "");
	}

	public static void printsub(int si, int m, int[] arr, String res) {
		if (si == arr.length) {
			if (m == 0) {
				System.out.print(res + " ");
			}
			return;
		}
		int num = arr[si];

		if (m - num >= 0)
			printsub(si + 1, m - num, arr, res + num + " ");
		printsub(si + 1, m, arr, res);
	}
 static int count=0;
	public static void print(int si, int m, int[] arr, String res) {
		if (si == arr.length) {
			if (m == 0) {
				count++;
			}
			return ;
		}
		int num = arr[si];

		if (m - num >= 0) 
			print(si + 1, m - num, arr, res + num + " ");
			print(si + 1, m, arr, res);
		
	}

}
