package testthecode2;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String st = scan.next();
		char[] ch=st.toCharArray();
		int ctr=ch.length;
		int flag=0,a=0,b=0;
		for(int i=0;i<ch.length;i++)
		{   
			for(int j=i+1;j<ch.length;j++)
			{  flag=0;
			if(ch[i]==ch[j])
			{
				a=i+1;
				b=j-1;
				while(b>a)
				{
					if(ch[a]!=ch[b])
					{
						flag=1;
						break;
						
					}
					b--;
					a++;
				}
				if(flag==0)
				{ctr++;}
				}
			
			}
			
		}
         System.out.print(ctr);
	}

}
