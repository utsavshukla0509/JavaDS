package testgthecode6;

import java.util.Scanner;

public class recursionkeypadcodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
String []table=new String[10];
table[1]="abc";
table[2]="def";
table[3]="ghi";
table[4]="jkl";
table[5]="mno";
table[6]="pqrs";
table[7]="tuv";
table[8]="wx";
table[9]="yz";
String str=s.next();
System.out.println(countkey(table,str));
reckey(table,str,"");		
	}
	public static void reckey(String []table,String str,String res) {
		if(str.length()==0) {
			System.out.print(res+" ");
			return;
		}
		int index=(int)str.charAt(0)-48;
		for(int i=0;i<table[index].length();i++) {
			reckey(table,str.substring(1),res+table[index].charAt(i));
		}
	}
	public static int countkey(String []table,String str) {
		int m=1;
		for(int i=0;i<str.length();i++) {
			m=m*table[(int)str.charAt(i)-48].length();
		}
		return m;
	}
}