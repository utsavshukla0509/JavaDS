package testgthecode6;

import java.util.Scanner;

public class towerofhanoi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		towerOfHanoi(n,"T1","T3","T2");
		System.out.println(printstep(1,n,1));
	}
	static void towerOfHanoi(int n, String string1, String string2, String string3)
    {
        if (n == 1)
        {
            System.out.println("Move 1th disc from " +  string1 + " to " + string3);
            return;
        }
        towerOfHanoi(n-1, string1, string3, string2);
        System.out.println("Move " + n +"th"+ " disc from " +  string1 + " to " + string3);
        towerOfHanoi(n-1, string2, string1, string3);
    }
	public static int printstep(int m,int n,int i) {
		if(i==n) {return m;}
		m=m*2+1;
		int t=printstep(m,n,i+1);
		return t;
	}
}
