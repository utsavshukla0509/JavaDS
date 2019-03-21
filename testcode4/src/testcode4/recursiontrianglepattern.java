package testcode4;

import java.util.Scanner;

public class recursiontrianglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
pattern(n,1,1);
	}
	public static void pattern(int n, int row, int col) {
		if (row > n) {
			return;
		}
		if (row > col) {
			System.out.println();
			pattern(n, row + 1, 1);
			return;
		}
		System.out.print("*"+" ");
		pattern(n, row, col + 1);
	}

}
