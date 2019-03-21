package testthecode3;

import java.util.Scanner;

public class recursionno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
pdiskip(7);

	}
public static void pdiskip(int n) {
	if(n==1) {System.out.println("1"); 
		return;}
	System.out.println(n);
	pdiskip(n-2);
	System.out.println(n-1);
}
}
