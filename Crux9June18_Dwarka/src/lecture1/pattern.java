package lecture1;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.print("Enter a no.");
int n=s.nextInt();
int z=1;
for(int i=1;i<=n;i++)
{for(int j=1;j<=i;j++)
	{System.out.print(z+" ");
	z++;}
    

System.out.println();
}

	}

}
