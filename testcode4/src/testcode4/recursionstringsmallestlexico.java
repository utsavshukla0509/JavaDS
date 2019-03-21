package testcode4;

import java.util.Scanner;

public class recursionstringsmallestlexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder sb=new StringBuilder();
		String ch=str;
		lstr(str,"",sb,ch);
		
			
		System.out.print(sb.toString());
	}

	public static void lstr(String str, String res,StringBuilder sb,String ch) {
		if (str.length() == 0) {
			int m=res.compareTo(ch);
			if(m<0)
			{sb.append(res);
			 sb.append(" ");
			
			}
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			lstr(ros, res + cc,sb,ch);
		}
	}


}
