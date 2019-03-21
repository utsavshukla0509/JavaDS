package testthecode;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int n=s.nextInt();
for(int i=n;i>=0;i--)
{ int a=n;
  for(int j=n;j>=i;j--)
  {System.out.print(a+" ");a--;}
  a=a+1;
  for(int k=1;k<=2*i-1;k++)
  {System.out.print(" "+" ");}
  if(a!=0) {
            for(int l=n;l>=i;l--)
            {System.out.print(a+" ");a++;}
           }
  else {for(int m=1;m<=n;m++)
            {System.out.print(m+" ");}
       }
  System.out.print("\n");
}
for(int x=1;x<=n;x++)
{  int c=n;
   for(int y=n;y>=x;y--)
   {System.out.print(c+" ");c--;}
   c=c+1;
   for(int z=1;z<=2*x-1;z++)
   {System.out.print(" "+" ");}
   for(int p=x;p<=n;p++)
   {System.out.print(c+" ");c++;}
   
	
System.out.print("\n");


}
}

}
