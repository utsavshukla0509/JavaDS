package testthecode;

import java.util.Scanner;

public class convertthedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int k=s.nextInt();
int u=875143;
int l=0;
int d=0;
int m=0;
while(u!=0)
{u=u/10;
 l++;}
double c=Math.pow(10, l-1);
for(int i=1;i<=k;i++)
{d=u%10;
 m=u/10;
 m=(int)(m+d*c);
	u=m;
}        
System.out.print(m);
	}
}
