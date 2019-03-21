package testthecode;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=n;i>=0;i--)
{   for(int j=n;j>i;j--)
    {System.out.print(" "+" ");}
    int a=i;
    for(int k=0;k<=i;k++)
    {System.out.print(a+" ");a--;}
    a=a+2;
    for(int l=i;l>=1;l--)
    {System.out.print(a+" ");a++;}
    System.out.print("\n");
}

for(int x=1;x<=n;x++)
{  int b=n-x;
   for(int y=b;y>=1;y--)
   {System.out.print(" "+" ");}
   int c=x;
   for(int z=0;z<=x;z++)
   {System.out.print(c+" ");c--;}
   c=c+2;
   for(int p=1;p<=x;p++)
   {System.out.print(c+" ");c++;}
   System.out.print("\n");
	




}




	}

}
