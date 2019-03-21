package testthecode2;

import java.util.Scanner;

public class oddevenchara {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c[]=str.toCharArray();
		int a=0;
		char cd;
		for(int i=0;i<c.length;i++)
		{    a=i+1;
			if(a%2==0)
			{    cd=(char)(c[i]-1); 
				System.out.print(cd);
			}
			else
			{
				cd=(char)(c[i]+1); 
				System.out.print(cd);
			}
			
			
		}
		
		
		
		
	}

}
