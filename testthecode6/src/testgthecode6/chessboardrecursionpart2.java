package testgthecode6;

import java.util.ArrayList;
import java.util.Scanner;

public class chessboardrecursionpart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = "";
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= n * n; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				list.add(i);
			}

		}
		int[] ros = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			ros[k] = list.get(k);
		}
		str = str + "{" + 0 + "-" + 0 + "}";
		count(0, 0, n - 1, n - 1, str, ros);
		System.out.println(count);
		chess(0, 0, n - 1, n - 1, str, ros);
	}

	public static int count = 0;

	public static void chess(int cr, int cc, int er, int ec, String str, int[] ros) {

		if (er == cr && ec == cc) {
			System.out.println(str + " ");

			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		String s = "";
		s = s + cr + cc;
		int a = Integer.parseInt(s);
		int b = btod(a, ec + 1);
		for (int m = 0; m < ros.length; m++) {
			if (ros[m] == b + 1) {
				if (m % 2 == 0) {
					return;
				}

				else if (m % 2 != 0) {
					chess(er, ec, er, ec, str + "P" + "{" + (er) + "-" + (ec) + "}", ros);
				}
			}
		}
		chess(cr + 2, cc + 1, er, ec, str + "K" + "{" + (cr + 2) + "-" + (cc + 1) + "}", ros);
		chess(cr + 1, cc + 2, er, ec, str + "K" + "{" + (cr + 1) + "-" + (cc + 2) + "}", ros);
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int i = 1; i <= er; i++) {
				chess(cr, cc + i, er, ec, str + "R" + "{" + cr + "-" + (cc + i) + "}", ros);
			}
		}
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int j = 1; j <= er; j++) {
				chess(cr + j, cc, er, ec, str + "R" + "{" + (cr + j) + "-" + cc + "}", ros);
			}
		}
		if (cr == cc || cr + cc == er) {
			for (int k = 1; k <= er; k++) {
				chess(cr + k, cc + k, er, ec, str + "B" + "{" + (cr + k) + "-" + (cc + k) + "}", ros);
			}
		}
	}

	public static int btod(int bin, int n) {
		int r = 0;
		int d = 0;
		int bp = 1;
		while (bin != 0) {
			d = bin % 10;
			r = r + d * bp;
			bp = bp * n;
			bin = bin / 10;

		}

		return r;

	}

	public static void count(int cr, int cc, int er, int ec, String str, int[] ros) {

		if (er == cr && ec == cc) {
			count++;

			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		String s = "";
		s = s + cr + cc;
		int a = Integer.parseInt(s);
		int b = btod(a, ec + 1);
		for (int m = 0; m < ros.length; m++) {
			if (ros[m] == b + 1) {
				if (m % 2 == 0) {
					return;
				}

				else if (m % 2 != 0) {
					count(er, ec, er, ec, str + "P" + "{" + (er) + "-" + (ec) + "}", ros);
				}
			}
		}
		count(cr + 2, cc + 1, er, ec, str + "K" + "{" + (cr + 2) + "-" + (cc + 1) + "}", ros);
		count(cr + 1, cc + 2, er, ec, str + "K" + "{" + (cr + 1) + "-" + (cc + 2) + "}", ros);
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int i = 1; i <= er; i++) {
				count(cr, cc + i, er, ec, str + "R" + "{" + cr + "-" + (cc + i) + "}", ros);
			}
		}
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int j = 1; j <= er; j++) {
				count(cr + j, cc, er, ec, str + "R" + "{" + (cr + j) + "-" + cc + "}", ros);
			}
		}
		if (cr == cc || cr + cc == er) {
			for (int k = 1; k <= er; k++) {
				count(cr + k, cc + k, er, ec, str + "B" + "{" + (cr + k) + "-" + (cc + k) + "}", ros);
			}
		}
	}

}
