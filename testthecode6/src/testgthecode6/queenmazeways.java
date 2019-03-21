package testgthecode6;

import java.util.*;

public class queenmazeways {
	static BitSet col = new BitSet(30);
	static BitSet d1 = new BitSet(30);
	static BitSet d2 = new BitSet(30);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean[][] board = new boolean[4][4];
		// System.out.println(countNQueens(board, 0)); O(n^2)

		// For better approach in O(n)

		// int n = s.nextInt();
		// int ans = 0;
		// solve(0, n, ans);
		// System.out.println(count);

		// For more better approach in O(k) where k <n(n is the input& k is the no. of
		// set bits)

		// n = s.nextInt();
		// done = ((1 << n)) - 1;
		// solvetimek(0, 0, 0);
		// System.out.println(ans);
	}
	public static int n, ans = 0, done;

	public static void solvetimek(int rowmask, int ld, int rd) {
		if (rowmask == done) {
			ans++;
			return;
		}
		int safe = done & (~(rowmask | ld | rd));
		while (safe != 0) {
			int p = safe & (-safe);
			safe = safe - p;
			solve(rowmask | p, (ld | p) << 1, (rd | p) >> 1);
		}
	}
	public static int count = 0;

	public static void solve(int r, int n, int ans) {
		if (r == n) {
			ans++;
			count = ans;
			return;
		}
		for (int c = 0; c < n; c++) {
			if (!col.get(c) && (!d1.get(r - c + n - 1)) && (!d2.get(r + c))) {
				col.set(c, true);
				d1.set(r - c + n - 1, true);
				d2.set(r + c, true);
				solve(r + 1, n, ans);
				col.set(c, false);
				d1.set(r - c + n - 1, false);
				d2.set(r + c, false);
			}
		}
	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}
		}

		return count;
	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;

	}

}
