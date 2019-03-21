import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c;
c=0;
for(int i=1;i<=n;i++)
{for(int j=1;j<=(n-i)*2;j++)
{System.out.print(" ");
	}
int a=i;
for(int k=1;k<=i;k++)
{
	System.out.print(a+" "); 
	a++;}
if(i>1)
	
{c+=2;
	if(c!=1) {
for(int b=2;b<=i;b++)
    {System.out.print(c+" ");
c--;

   }c+=1;
}

	
	}
System.out.print("\n");
}


	}

}
