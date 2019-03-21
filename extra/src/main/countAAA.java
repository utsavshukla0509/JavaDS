package main;

import java.util.Scanner;

public class countAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		overlap(str,0);
		notoverlap(str,0);
	}

	public static void overlap(String str,int count) {
		if (str.length() < 3) {
			System.out.println(count);
          return;
		}
        if(str.substring(0,3).equals("aaa")) {
        	count++;
        }
		String ros = str.substring(1);
		overlap(ros,count);

	}
	public static void notoverlap(String str,int count) {
		if(str.length()<3) {
			System.out.println(count);
			return;
		}
		if(str.substring(0,3).equals("aaa")) {
			count++;
		}
		String ros=str.substring(3);
		notoverlap(ros,count);
	}
}
