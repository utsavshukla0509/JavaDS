package testthecode;

import java.util.Scanner;

public class rain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int a=scan.nextInt();
     for(int i=0;i<a;i++)
     {
    	int b=scan.nextInt();
    	int [] c=new int[b];
    	for(int j=0;j<b;j++)
    	{
    		c[j]=scan.nextInt();
    	}
    	int max=0,ans=0;
    	int [] d=new int[b];
    	int [] e=new int[b];
    	d[0]=0;
    	for(int s=1;s<b;s++)
    	{
    		if(c[s-1]>max)
    		{ 
    			max=c[s-1];
    		}
    		d[s]=max;
    	}
    	max=0;
    	e[b-1]=0;
    	for(int z=b-2;z>=0;z--)
    	{
    		if(c[z+1]>max)
    		{
    			max=c[z+1];
    		}
    		e[z]=max;
    	}
    	for(int x=0;x<b;x++)
    	{
    		
    		 if((Math.min(d[x],e[x]) - c[x])>0)
    		 {
    			 ans+=Math.min(d[x],e[x]) - c[x];
    		 }
    	}
    	System.out.println(ans);
    	
     }
	}

}
