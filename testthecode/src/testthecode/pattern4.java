package testthecode;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int n=s.nextInt();
int a=n;
for(int i=1;i<=(n/2)+1;i++)
{ 
  int b=i;
	for(int j=1;j<=a-b;j++)
	{System.out.print(" "+" ");}a--;
	
	int c=i;
	for(int k=1;k<=i;k++)
	{System.out.print(c+" ");c--;}
	if(i!=1)
	{ int d=i-1;
	  for(int l=1;l<=2*d-1;l++)
	  {System.out.print(" "+" ");}
	  int e=1;
	  for(int m=1;m<=i;m++)
	  {System.out.print(e+" ");e++;}
	}
System.out.print("\n");
}

int f=1;
int g=n-4;
for(int x=n/2;x>=1;x--)
{  for(int y=1;y<=2*f;y++)
   {System.out.print(" "+" ");}
   f++;
   for(int z=x;z>=1;z--)
   {System.out.print(z+" ");}

   for(int p=1;p<=g;p++)
   {System.out.print(" "+" ");}
   g=g-2;
   
   if(x!=1) {
   for(int q=1;q<=x;q++)
   {System.out.print(q+" ");}
   
   }
   System.out.print("\n");



}
	}

}
