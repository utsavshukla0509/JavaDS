package testthecode3;

import java.util.Scanner;

public class recursioncontaininanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int n=s.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++)
{arr[i]=s.nextInt();}
int m=s.nextInt();
int a=rcaa(arr,m,0);
if(a==0) {System.out.print("true");}
else {System.out.println("false");}
	}
public static int rcaa(int []arr,int m,int i) {
	if(i==arr.length) {return -1;}
	if(arr[i]==m) {return 0;}
	else {return rcaa(arr,m,i+1);}
}

}
