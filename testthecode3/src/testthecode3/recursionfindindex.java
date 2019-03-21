package testthecode3;

import java.util.Scanner;

public class recursionfindindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{arr[i]=s.nextInt();}
		int m=s.nextInt();
		System.out.print(firstIndex(arr,0,m));
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		} else {
			return firstIndex(arr, si + 1, data);
		}
	}

}
