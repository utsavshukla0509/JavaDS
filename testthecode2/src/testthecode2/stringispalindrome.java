package testthecode2;

import java.util.Scanner;

public class stringispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			{System.out.println("true");}
		else
			{System.out.println("false");}
	}

}
