import java.util.Scanner;

public class pascalstriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(1);
if(n>1)
{
	
for(int i=2;i<=n;i++)
{
	System.out.print(i+" ");
	
	for(int j=1;j<=i-2;j++)
	{
		System.out.print(0+" ");
	}
	System.out.println(i+" ");
	
	}



}
}
}