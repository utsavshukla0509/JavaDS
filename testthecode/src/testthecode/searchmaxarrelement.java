package testthecode;

import java.util.Scanner;

public class searchmaxarrelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{ arr[i]=s.nextInt();}


System.out.print(max(arr));
	
	}

	public static int max(int[] arr) {
    int a=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>a)
			{a=arr[i];}
			
		}
		return a;
	}
}
