import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++)
{for(int j=3;j<2*i+1;j++)
    {System.out.print(" ");
	}
for(int k=n;k>=i;k--)
{
System.out.print("*");
}
System.out.print("\n");
	}
	}

}
