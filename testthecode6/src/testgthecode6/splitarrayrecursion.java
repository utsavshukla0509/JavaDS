package testgthecode6;

import java.util.Scanner;

public class splitarrayrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		String str = "";
		for (int i = 0; i < n; i++) {
			str = str + arr[i];
		}
		count(str, 0, 0, "", "");
		System.out.println(count);
		split(str, 0, 0, "", "");
	}
public static int count=0;
	public static void split(String str, int sum1, int sum2, String a, String b) {
		if (str.length() == 0) {
			if (sum1 == sum2) {
				System.out.println(a + " and" + b);
				return;
			} else {
				return;}
		} 
		char cc = str.charAt(0);
		String ros = str.substring(1);
		split(ros, sum1 + Integer.parseInt(String.valueOf(cc)), sum2, a + " " + cc, b);
		split(ros, sum1, sum2 + Integer.parseInt(String.valueOf(cc)), a, b + " " + cc);
	}
	public static void count(String str, int sum1, int sum2, String a, String b) {
		if (str.length() == 0) {
			if (sum1 == sum2) {
				count++;
				return;
			} else {
				return;}
		} 
		char cc = str.charAt(0);
		String ros = str.substring(1);
		count(ros, sum1 + Integer.parseInt(String.valueOf(cc)), sum2, a + " " + cc, b);
		count(ros, sum1, sum2 + Integer.parseInt(String.valueOf(cc)), a, b + " " + cc);
	}
}
