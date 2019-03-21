import java.util.Scanner;

public class ftoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int o=s.nextInt();
ftoc(n,m,o);		
}
	
	
public static void ftoc(int n,int m,int o)
{
   for(int i=n;i<=m;i+=o)
	{int  C=0;
	{C=(int)((5.0/9)*(i-32));
	System.out.println(i+" "+C);
		
	}
    }
}
	

}
