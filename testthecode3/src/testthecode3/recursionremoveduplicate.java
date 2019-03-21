package testthecode3;

import java.util.Scanner;

public class recursionremoveduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder p = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		p = (dup(str, sb, 0));
		System.out.print(p);
	}

	public static StringBuilder dup(String str, StringBuilder sb, int i) {
		if (i == str.length() - 1) {
			sb.append(str.charAt(i));
			return sb;
		}
		if (str.charAt(i) != str.charAt(i + 1)) {
			sb.append(str.charAt(i));
			dup(str, sb, i + 1);
			return sb;
		} else {
			sb.append(str.charAt(i));
			dup(str, sb, i + 1);
			return sb;
		}

	}
}
