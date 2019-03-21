package testthecode3;

import java.util.Scanner;

public class recursionsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
int []arr= new int[n];
for(int i=0;i<n;i++)
{ arr[i]=s.nextInt();
	}
System.out.print(issort(arr,0));
	}
public static boolean issort(int []arr,int i) {
	if(arr.length==1) {return true;}
	if(i==arr.length-1) {return true;}
	boolean prev;
	if(arr[i+1]>arr[i]) {
		prev=true;
		i++;
		prev=issort(arr,i);
		return prev;
	}
	else {return false;}
	
}
}
