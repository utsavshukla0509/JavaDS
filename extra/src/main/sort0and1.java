package main;

import java.util.Scanner;

public class sort0and1 {
	  public static void main(String args[]) {
	        // Your Code Here
	    Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			arr=sort(arr);
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
	public static int[] sort(int arr[]) {
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {count0++;}
			if(arr[i]==1) {count1++;}
			if(arr[i]==2) {count2++;}
			
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;}
		for(int j=count0;j<(count0+count1);j++) {
			arr[j]=1;
		}
		for(int k=(count0+count1);k<arr.length;k++) {
			arr[k]=2;
		}
		return arr;
		}
		
}
