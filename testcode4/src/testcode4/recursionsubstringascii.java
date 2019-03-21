package testcode4;

import java.util.Scanner;

public class recursionsubstringascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		String str=s.next();
		int a=1;
		for(int i=0;i<str.length();i++)
		{
			a=a*3;
		}
		System.out.println(a);
ss(str,"");
	}

public static void ss(String str,String res){
	if(str.length()==0) {
		System.out.print(res+" ");
		return;
	}
	char cc=str.charAt(0);
	String sc=str.substring(1);
	ss(sc,res);
	ss(sc,res+cc);
	ss(sc,res+(int)cc);
}

}
