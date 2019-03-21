package testthecode3;

import java.util.Scanner;

public class recursionnthtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
int n=a.nextInt();
System.out.print(tri(n,1));
	}
public static int tri(int n,int i) {
	if(i==n) {return i ;}
	i=i+tri(n,i+1);
	return i;
}
}
