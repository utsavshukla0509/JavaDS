package testcode4;

import java.util.Scanner;

public class recursioninvertedtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
pattern(n,n,1);
	}
	public static void pattern(int n, int row, int col) {
		if (row<1) {
			return;
		}
		if (col > row) {
			System.out.println();
			pattern(n, row - 1, 1);
			return;
		}
		System.out.print("*"+" ");
		pattern(n, row, col+1);
	}
}
