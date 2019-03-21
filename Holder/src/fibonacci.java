import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0,a=0,b=1;
while(a<=n)
{
 c=a+b;
 System.out.println(a);
 a=b;
 b=c;
 c++;
}


}}