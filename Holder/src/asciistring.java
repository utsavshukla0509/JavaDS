import java.util.Scanner;

public class asciistring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			int diff = ch - prev;
			sb.append(prev);
			sb.append(diff);

			prev = ch;
		}
		sb.append(prev);
		System.out.println(sb.toString());

	}

}
