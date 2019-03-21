import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
armstrongnumber(n,m);
	}
public static void armstrongnumber(int n,int m)
{
 for(int j=n;j<m;j++)
{
	 int r=0;
	 int d=0;
	 int temp=j;
 int i=j;
 while(i!=0) {
 d=i%10;
 r=r+d*d*d;
 i=i/10;
 }
if(temp==r) {System.out.println(r);}
}
	
	
	
}



}
