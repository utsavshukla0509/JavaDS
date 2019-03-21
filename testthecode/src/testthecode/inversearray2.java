package testthecode;

import java.util.Scanner;

public class inversearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int c;
		
			
		for(int i=0;i<arr.length;i++)
		{ arr[i]=s.nextInt();}
		c=inv(arr,n);
		if(c==0) {System.out.print("true");}
		else {System.out.print("false");}
	}
public static int inv(int[]arr,int n) {
	int arr1[]=new int[n];
	int i=0;
	int a=0;
	
	for(i=0;i<arr1.length;i++)
	{if(arr[i]<n&&arr[i]>=0){

		arr1[arr[i]]=i;
	}
	else {a++;break;}
	}
	return a;
}
	

}
