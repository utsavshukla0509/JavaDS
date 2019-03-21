package lecture1;

import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=2;i<=n;i++)
			{int flag=0;
			for(int j=2;j<i;j++)
		{
			if(i%j==0)
				flag++;
		}
		if(flag==0)
		{System.out.print(i);}
		
		
		}
	}

}
