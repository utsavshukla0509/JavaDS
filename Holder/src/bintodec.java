import java.util.Scanner;

public class bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int bin =s.nextInt();
System.out.print(btod(bin));
	}
public static int btod(int bin) {int r=0;
                                 int d=0;
                                 int bp=1;
	while(bin!=0)
	{d=bin%10;
	 r=r+d*bp;
	 bp=bp*2;
	 bin=bin/10;
		
		
	}
	
	return r;
	
}
}
