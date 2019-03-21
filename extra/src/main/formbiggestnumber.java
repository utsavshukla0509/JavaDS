package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class formbiggestnumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int m = s.nextInt();
			int[] arr = new int[m];
			for (int j = 0; j < m; j++) {
				arr[j] = s.nextInt();
			}
			formbiggestnumber(arr);
		}
	}

	public static void formbiggestnumber(int[] arr) {
		String[] str1 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			str1[i] = String.valueOf(arr[i]);
		}

		Arrays.sort(str1, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});

		StringBuilder str = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			str.append(arr[i]);
		}

		System.out.println(str.toString());
	}

}
