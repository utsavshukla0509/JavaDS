package lecture1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int r=0;
int d=0;
System.out.print("Enter a no.");
int n=s.nextInt();
 while(n!=0)
{d=n%10;
 r=r*10+d;
 n=n/10;
}
 System.out.print("reverse no. is :"+" "+r);
	}

}
