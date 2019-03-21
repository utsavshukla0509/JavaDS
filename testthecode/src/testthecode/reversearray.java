package testthecode;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{ arr[i]=s.nextInt();}
rev(arr,n);
	
	}
	
	
public static void rev(int[]arr,int n)
{int arr1[]=new int[n];
int j=arr.length-1;
 for(int i=0;i<arr.length;i++)
 {arr1[j]=arr[i];
	 j--;
 }
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr1[k]);
	}
}
	}


