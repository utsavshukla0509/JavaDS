package testthecode;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{ arr[i]=s.nextInt();}
int m=s.nextInt();
System.out.print(bins(arr,m));
	}
	public static int bins(int[] arr, int data) {
		for(int i=0;i<arr.length;i++)
		{for(int j=i+1;j<arr.length;j++)
		{  if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
			
		}
		int flag = -1;
		int fst = 0;
		int lst = arr.length - 1;
		int mid = (fst + lst) / 2;
		while (fst <= lst) {
			mid = (fst + lst) / 2;
			if (arr[mid] == data) {
				flag = mid;
				//fst=lst+1;(optional)
				
				break;
			} else if (arr[mid] > data) {
				lst = mid - 1;

				
			} else {
				fst = mid+1;
				

			}

		}

		return flag;
	}
}
