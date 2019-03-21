import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
series(n,m);
	}
	public static void series(int n,int m)
	{int i=0;
	int r=0;
	 for(int j=1;j<100;j++)
	 {  if(i==n) {break;}
 		 r=3*j+2;
	   if(r%m!=0) {System.out.println(r);i++;}
	   
		 
		
	 }
		
		
		
		
	}

}
