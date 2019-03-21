package testcode4;

import java.util.Scanner;

public class recursiontwins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(twin(str, 0, 2));
	}

	public static int twin(String str, int count, int i) {
		if (i == str.length()) {
			return count;
		}
		if (str.charAt(i - 2) == str.charAt(i)) {
			count++;
		}
		int n = twin(str, count, i + 1);
		return n;

	}
}
