package testthecode2;

import java.util.Scanner;

public class convetlowetoupperstringtoggle {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		System.out.print(clu(str,sb).toString());
	}
	public static StringBuilder clu(String str,StringBuilder sb)	{
		
		for (int i = 0; i < str.length(); i++) {
        int a=str.charAt(i);
        if(a>64&&a<97) {
        	a=a+32;
        	char c=(char) a;
        	sb .append(c);
        	 }
        else {a=a-32;
               char c=(char)a;
               sb.append(c);}
		}
		return sb;
	}

}