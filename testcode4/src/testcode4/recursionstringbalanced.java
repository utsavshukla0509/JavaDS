package testcode4;

import java.util.Scanner;

public class recursionstringbalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(strbal(str, 0, 0, 0, 0));
	}

	public static boolean strbal(String str, int index, int flag, int f1, int f) {
		if (index == str.length()) {
			if (flag == 0 && f1 == 0 && f == 0) {
				return true;
			} else {
				return false;
			}
		}

		if (str.charAt(index) == '(') {
			flag = 1;
			return strbal(str, index + 1, flag, f1, f);
		}
		if (str.charAt(index) == '{') {
			f1 = 1;
			return strbal(str, index + 1, flag, f1, f);
		}
		if (str.charAt(index) == '[') {
			f = 1;
			return strbal(str, index + 1, flag, f1, f);
		}
		if (str.charAt(index) == ')') {
			flag = 0;
			return strbal(str, index + 1, flag, f1, f);
		}
		if (str.charAt(index) == '}') {
			f1 = 0;
			return strbal(str, index + 1, flag, f1, f);
		}
		if (str.charAt(index) == ']') {
			f = 0;
			return strbal(str, index + 1, flag, f1, f);
		}
		return strbal(str, index + 1, flag, f1, f);
	}
}
