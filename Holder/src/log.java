import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.print(log(n,m));
	}
public static int log(int n,int m)
{int pb=0;
int base=1;
 while(base!=n)
 {base=base*m;
 pb++;
 }
 return pb;
	

}
}
