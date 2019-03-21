package testgthecode6;

import java.util.Scanner;

public class chessboardrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = "";
		str = str + "{" + 0 + "-" + 0 + "}";
		count(0, 0, n - 1, n - 1, str);
		System.out.println(count);
		chess(0, 0, n - 1, n - 1, str);
	}

	public static int count = 0;

	public static void chess(int cr, int cc, int er, int ec, String str) {
		if (er == cr && ec == cc) {
			System.out.println(str + " ");

			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		chess(cr + 2, cc + 1, er, ec, str + "K" + "{" + (cr + 2) + "-" + (cc + 1) + "}");
		chess(cr + 1, cc + 2, er, ec, str + "K" + "{" + (cr + 1) + "-" + (cc + 2) + "}");
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int i = 1; i <= er; i++) {
				chess(cr, cc + i, er, ec, str + "R" + "{" + cr + "-" + (cc + i) + "}");
			}
		}
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int j = 1; j <= er; j++) {
				chess(cr + j, cc, er, ec, str + "R" + "{" + (cr + j) + "-" + cc + "}");
			}
		}
		if (cr == cc || cr + cc == er) {
			for (int k = 1; k <= er; k++) {
				chess(cr + k, cc + k, er, ec, str + "B" + "{" + (cr + k) + "-" + (cc + k) + "}");
			}
		}

	}

	public static void count(int cr, int cc, int er, int ec, String str) {
		if (er == cr && ec == cc) {
			count++;

			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}
		count(cr + 2, cc + 1, er, ec, str + "K" + "{" + (cr + 2) + "-" + (cc + 1) + "}");
		count(cr + 1, cc + 2, er, ec, str + "K" + "{" + (cr + 1) + "-" + (cc + 2) + "}");
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int i = 1; i <= er; i++) {
				count(cr, cc + i, er, ec, str + "R" + "{" + cr + "-" + (cc + i) + "}");
			}
		}
		if (cr == 0 || cr == er || cc == 0 || cc == er) {
			for (int j = 1; j <= er; j++) {
				count(cr + j, cc, er, ec, str + "R" + "{" + (cr + j) + "-" + cc + "}");
			}
		}
		if (cr == cc || cr + cc == er) {
			for (int k = 1; k <= er; k++) {
				count(cr + k, cc + k, er, ec, str + "B" + "{" + (cr + k) + "-" + (cc + k) + "}");
			}
		}
	}
}
