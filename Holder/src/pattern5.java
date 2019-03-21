import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int n=s.nextInt();
int m;
m=n;
for(int i=1;i<=n;i++)
 {   
    for(int j=1;j<=n-i;j++)
    {System.out.print(" ");
    	
    	
    }
    n--;
    for(int k=1;k<=2*i-1;k++)
    {
    	System.out.print("*"+" ");
    }
    System.out.print("\n");
}
int a;
for(a=1;a<=n;a++)
{
  for(int b=1;b<=2*a;b++)
  {System.out.print(" "); 	  
  }
	
	for(int d=1;d<=m-2*a;d++)
	{
		System.out.print("*"+" ");
	}
	System.out.print("\n");
	}}

}
