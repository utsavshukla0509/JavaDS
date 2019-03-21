package testthecode;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int n=s.nextInt();
for(int j=1;j<=n;j++)
{System.out.print("*"+" ");}
System.out.print("\n");
for(int i=1;i<=n/2;i++)
{int a; 
 a=n/2;
 for(int k=i;k<=a;k++)
 {System.out.print("*"+" ");}
 
 for(int l=1;l<=2*i-1;l++)
 {System.out.print(" "+" ");}

 int b=n/2;
 for(int m=i;m<=b;m++)
 {System.out.print("*"+" ");}
 System.out.print("\n");
}


for(int t=1;t<=n/3;t++)
{for(int x=1;x<=t+1;x++)
{System.out.print("*"+" ");}
for(int y=1;y<=(n-2)-2*t;y++)
{System.out.print(" "+" ");}
for(int z=1;z<=t+1;z++)
{System.out.print("*"+" ");}
System.out.print("\n");	
}
for(int f=1;f<=n;f++)
{System.out.print("*"+" ");}


	}

}
