import java.util.Scanner;

public class fibonnaciipattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0;
System.out.println(a);
int b=1,c=0;
for(int i=2;i<=n;i++)
{for(int j=1;j<=i;j++)
{if(b==1) { System.out.print(b+" ");}
else{System.out.print(c+" ");}
	c=a+b;
a=b;
b=c;

 
	}
System.out.print("\n");
}
	}

}
