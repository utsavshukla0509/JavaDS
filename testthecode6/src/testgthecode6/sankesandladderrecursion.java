package testgthecode6;

import java.util.ArrayList;
import java.util.Scanner;

public class sankesandladderrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int []arr=new int[m];
for(int i=0;i<m;i++) {
	arr[i]=s.nextInt();
}
ArrayList<Integer>list=new ArrayList<>();
for (int i = 2; i<=n*n; i++) {
	   int count = 0;
	   for (int j = 2; j<=i/2; j++) {
	    if (i % j == 0) {
	     count++;
	     break;
	    }
	   }

	   if (count == 0) {
		   list.add(i);
	   }

	  }
int []ros=new int[list.size()];
for(int k=0;k<list.size();k++) {
	ros[k]=list.get(k);
}
System.out.print(sandl(arr,ros,n*n,1,0));
	}
	public static boolean b=false;
public static boolean sandl(int[]arr,int[]ros,int a,int cur,int i) {
	if(cur==a) {
		return true;
	}
	if(i==arr.length) {return false;}
	
	if(cur+arr[i]<=a) {
	cur=cur+arr[i];
	for(int k=0;k<arr.length;k++) {
		if(cur==ros[k]) {
			if(i%2==0) {
				cur=ros[(ros.length-1)-k];
				 b=sandl(arr,ros,a,cur,i+1);
			}
			else {
				   if(cur>ros[k]) {
					   cur=ros[(ros.length-1)-k];
					   b=sandl(arr,ros,a,cur,i+1);
				   }
				   else {b=sandl(arr,ros,a,cur,i+1);
					   
				   }
			}
		}
	}
	}
	else { b=sandl(arr,ros,a,cur,i+1);}
	b=sandl(arr,ros,a,cur,i+1);
	return b;
}
}
