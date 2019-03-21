package testthecode;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int dec=s.nextInt();
System.out.print(dectobin(dec));
	
	
	}
public static int dectobin(int dec) {
	int quo=1;
	int rem;
	int c=1;
	int r=0;
	int d=0;
	while(quo!=0)
	{rem=dec%2;
	 quo=dec/2;
	 dec=quo;
	 c=c*10+rem;
	 }
	while(c!=0)
	{d=c%10;
	 r=r*10+d;
	 c=c/10;
		
	}
	int z=r/10;
	return z;
}	
	
	
	

}
