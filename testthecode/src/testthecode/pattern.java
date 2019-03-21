package testthecode;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner s = new Scanner(System.in);
           int a=s.nextInt();
           int h=0;
           for(int i = 1;i<=a;i++)
           {   h=2*i-1;
        	   for(int j=0;j<a-i;j++)
        	   {System.out.print("  ");}
        	   for(int k=0;k<i;k++)
        	   { System.out.print(i+k+" "); }
        	   for(int l=0;l<i-1;l++)
        	   {  
        		   System.out.print(h-l-1+" ");
        	   }
        	   
        	   
        	System.out.println();   
           }
           
	}

}
