package testgthecode6;

import java.util.Scanner;

public class stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(convertstoi(str,' '));
	}
public static int convertstoi(String str,char n) {
	if(str.length()==0) {
		return Integer.parseInt(String.valueOf(n));
	}
	char cc=str.charAt(0);
	String ros=str.substring(1);
	int m=convertstoi(ros,cc);
	if(ros.length()==0) {m=m+((Integer.parseInt(String.valueOf(cc)))*0);}
	else {m=m+((Integer.parseInt(String.valueOf(cc)))*(int)Math.pow(10,ros.length()));}
	return m;
}
}
