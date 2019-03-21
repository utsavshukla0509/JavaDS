import java.util.Scanner;

public class octtobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int oct=s.nextInt();
System.out.print(otob(oct));
	}
public static int otob(int oct)
{int bp=1;
int d=0;
int r=0;
int m;
	while(oct!=0)
	{d=oct%10;
	 r=r+d*bp;
	 bp=bp*8;
	 oct=oct/10;
	}		
	int a=1;
	int b=0;
	int c=0;
	while(r!=0)
	{b=r%2;
	 c=c+b*a;
	 a=a*10;	
	 r=r/2;	
	}
	return c;
	
} 
}
