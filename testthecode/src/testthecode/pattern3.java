package testthecode;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
         int row=1;
         
         while(row<=n) {
        	 int csp=1;
        	 while(csp<=n-row) {
        		 System.out.print(" "+" ");
        		 csp++;
        	 }
        	 
        	 int value=row;
        	 int incvalues=row;
        	 int cst=1;
        	 while(cst<=incvalues) {
        		 System.out.print(value+" ");
        		 cst++;
        		 value++;
        	 }
        	 value=value-2;
        	 int decvalues=row-1;
        	 cst=1;
        	 while(cst<=decvalues) {
        		 System.out.print(value+" ");
        		 cst++;
        		 value--;
        	 }
        	 
        	 
        	 row++;
        	 System.out.print("\n");
         }

for(int x=1;x<=n;x++)
{  for(int y=1;y<=x;y++)
   {System.out.print(" "+" ");}
 int l;
 l=n-x;
   for(int  z=n-x;z>=1;z--)
   {System.out.print(l+" ");l++;}
   l=l-2;
   for(int m=n-x;m>1;m--)
   {System.out.print(l+" ");l--;}
System.out.print("\n");
}
         
                
	}

}
