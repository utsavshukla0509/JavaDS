import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b,c=0;
        System.out.println(1);
        if(a>=2)
        {System.out.println(1+" "+1);}
        if(a>2)
        {
        for(int i=2;i<=a-1;i++)
        {    System.out.print(1+" ");
        	for(int j=1;j<=i-1;j++)
        	{
        	    b=1;
        	    int g=i,m=1;
        	    for(int k=1;k<=j;k++)
        	    {b=b*g;
        	    m=m*k;
        	    g--;
        	    }
        	    
        	    c=b/m;
        	    System.out.print(c+" ");
        		
        		
        	}
        	System.out.println(1+" ");
        	
        }
	}
	}
}
