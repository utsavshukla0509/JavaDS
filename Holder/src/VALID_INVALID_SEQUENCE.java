import java.util.Scanner;

public class VALID_INVALID_SEQUENCE {
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  int a=scan.nextInt();
	  int b=0,c=1000000000,flag=0,d=0;
	  for(int i=0;i<a;i++)
	  {
		  b=scan.nextInt();
		  d=a-i;
		  if(b<c)
		  {c=b;}
		  else
		  {	c=b;  
		  break; }
		  
	  }
	  for(int j=0;j<d-1;j++)
	  {
		  b=scan.nextInt();
		  if(b>c)
		  {c=b;}
		  else
		  {
			  c=b;
			  flag=1;
		  }
		  
	  }
	  if(flag==0)
	  {System.out.println("true");}
	  else
	  {System.out.println("false");}
  }
}
