package testthecode5;

import java.util.Scanner;

public class recursionmazepathandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.println(countMazePath(n,m,1,1));
printMazePath(n,m,1,1,"");
	}
	public static int countMazePath(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(er, ec, cr, cc + 1);
		count = count + countMazePath(er, ec, cr + 1, cc);
		return count;
	}
	public static void printMazePath(int er, int ec, int cr, int cc, String path) {
		if (er == cr && ec == cc) {
			System.out.print(path+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		
		printMazePath(er, ec, cr + 1, cc, path + "V");
		printMazePath(er, ec, cr, cc + 1, path + "H");
	}
}
