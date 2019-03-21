import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{for(int j=1;j<=i;j++)
	{System.out.print(a+"\t");
	 a++;}
System.out.print("\n");}
	}

}
