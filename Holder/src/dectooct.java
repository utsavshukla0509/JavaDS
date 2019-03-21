import java.util.Scanner;

public class dectooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int dec=s.nextInt();
System.out.print(dtoo(dec));
}
public static int dtoo(int dec)
{int d=0;
int bp=1;
int r=0;
	while(dec!=0)
	{d=dec%8;
	 r=r+d*bp;
	 bp=bp*10;
	 dec=dec/8;
	 }
	return r;
	
	
}
}
