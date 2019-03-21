import java.util.Scanner;

public class longestcommonsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.println(lcs(str1, str2, 0));
	}

	public static int max = 0;

	public static int lcs(String str1, String str2, int count) {
		
		if (str1.equals(str2)) {
			if (count > max) {
				max = count;

			}
			return max;
		}
		if(str1==null||str2==null) {
			return count;
		}

		count = 0;
		char cc1 = str1.charAt(0);

		char cc2 = str2.charAt(0);
		String str = "";
		String s = "";

		for (int i = 0; i < str1.length(); i++) {
			str = str + str1.substring(0, i) + cc1 + str1.substring(i, str1.length());
			lcs(str, s, count);
		}
		
		for (int i = 0; i < str2.length(); i++) {
			s = s + str2.substring(0, i) + cc2 + str2.substring(i, str2.length());
			lcs(str, s, count);
		}
		
		return max;

	}
}
