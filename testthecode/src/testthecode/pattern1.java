package testthecode;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a;
	a=n;
	for(int i=1;i<=n;i++)
	{ if(i!=n)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		for(int k=1;k<=2*a-3;k++)
		{
			System.out.print(" "+" ");
		}
		a--;
		int c;
		c=i;
		
		for(int b=1;b<=i;b++)
		{
			System.out.print(c+" ");
			c-=1;
		}
	}
	else
	{
		for(int z=1;z<=n;z++)
		{System.out.print(z+" ");}
		
		for(int d=n-1;d>0;d--)
		{System.out.print(d+" ");}
		
		
		
	}
	System.out.print("\n");
	}
	}
}
