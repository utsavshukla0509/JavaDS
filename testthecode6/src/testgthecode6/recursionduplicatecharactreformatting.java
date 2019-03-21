package testgthecode6;

import java.util.Scanner;

public class recursionduplicatecharactreformatting {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
String str=s.next();
System.out.print(dcf(str,' '));
	}
public static String dcf(String str,char cc) {
	if(str.length()==0) {
		str=str+" ";
	 return str;
	}
	cc=str.charAt(0);
	String ros=str.substring(1);
	String m=dcf(ros,cc);
	if(cc==m.charAt(0)) {
		m="*"+m;
		m=cc+m;
	}
	else {
		m=cc+m;
	}
	return m;
}
}
