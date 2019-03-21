import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
System.out.print(countdigit(n,m));
	}
public static int countdigit(int n,int m)
{int d=0;
int i=0;
	while(n!=0)
  { d=n%10;
	n=n/10;
	if(d==m) {i++; }
	

  }
	return i;

}
}
