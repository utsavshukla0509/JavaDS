package testthecode3;

import java.util.Scanner;

public class recursionparaenthesis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder p = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		p = (dup(str, sb, 0));
		System.out.print(p);
	}

	static int h = 0;

	public static StringBuilder dup(String str, StringBuilder sb, int i) {

		if (str.charAt(i) == '(') {

			h = 1;
			dup(str, sb, i + 1);
			return sb;
		} else if (str.charAt(i) == ')') {
			
			h = 0;
			return sb;

		} else if (h == 1) {
			sb.append(str.charAt(i));
			dup(str, sb, i + 1);
			return sb;
		}

		else {
			dup(str, sb, i + 1);

			return sb;
		}

	}

}
