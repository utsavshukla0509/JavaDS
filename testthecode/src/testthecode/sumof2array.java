package testthecode;

import java.util.Scanner;

public class sumof2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}
		int m = s.nextInt();
		int arr2[] = new int[m];
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = s.nextInt();
		}

		if (n > m) {

			int i = n - 1;
			int j = m - 1;
			int k = n - 1;
			int c = 0;
			int carry = 0;
			int sum[] = new int[n];
			while (j >= 0) {
				c = arr1[i] + arr2[j] + carry;
				sum[k] = c % 10;
				carry = c / 10;
				j--;
				i--;
				k--;
			}

			if (i >= 0) {
				c = arr1[i] + carry;
				sum[k] = c % 10;
				carry = c / 10;
				i--;
				k--;
			}
			if(carry!=0) {System.out.print(carry+", ");}
			for (int p = 0; p < n; p++) {
				System.out.print(sum[p]+","+" ");
			}
			System.out.print("END");
		} else if (m > n) {
			int i = n - 1;
			int j = m - 1;
			int k = m - 1;
			int c = 0;
			int carry = 0;
			int sum[] = new int[m];
			while (i >= 0) {
				c = arr1[i] + arr2[j] + carry;
				sum[k] = c % 10;
				carry = c / 10;
				j--;
				i--;
				k--;
			}

			if (j >= 0) {
				c = arr2[j] + carry;
				sum[k] = c % 10;
				carry = c / 10;
				j--;
				k--;
			
			}
			if(carry!=0) {System.out.print(carry+", ");}
			for (int p = 0; p < m; p++) {
				System.out.print(sum[p]+","+" ");
			}
			System.out.print("END");
		} else {
			int i = n - 1;
			int j = m - 1;
			int k = m - 1;
			int c = 0;
			int carry = 0;
			int sum[] = new int[m];
			while (i >= 0) {
				c = arr1[i] + arr2[j] + carry;
				sum[k] = c % 10;
				carry = c / 10;
				j--;
				i--;
				k--;
			
			}
			if(carry!=0) {System.out.print(carry+", ");}
			for (int p = 0; p < m; p++) {
				System.out.print(sum[p]+","+" ");
			}
			System.out.print("END");
		}
	}
}