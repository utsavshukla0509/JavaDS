import java.util.Scanner;

public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int a=m*n;
if(n>m)
{
n=n+m;
m=n-m;
n=n-m;
}
int b=1;
while(b!=0)
{
b=m%n;
m=n;
n=b;
}
m=a/m;
System.out.println(m);


	}

}
