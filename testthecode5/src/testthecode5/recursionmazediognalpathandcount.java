package testthecode5;

import java.util.Scanner;

public class recursionmazediognalpathandcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		if(n==1&&m==1) {
			System.out.print(0);
		}
		else {
		System.out.println(countMazePath(n,m,1,1));
		printMazePathWD(n,m,1,1,"");
	}}
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
		if(cr==cc||cr+cc==er+1) {count = count + countMazePath(er, ec, cr + 1, cc+1);}
		return count;
	}
	public static void printMazePathWD(int er, int ec, int cr, int cc, String path) {
		if (er == cr && ec == cc) {
			System.out.print(path+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePathWD(er, ec, cr + 1, cc, path + "V");
		printMazePathWD(er, ec, cr, cc + 1, path + "H");
		if(cr==cc||cr+cc==er+1) {printMazePathWD(er, ec, cr + 1, cc + 1, path + "D");}

	}
}
