package testthecode3;

import java.util.Scanner;

public class recursionallindices {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{arr[i]=s.nextInt();}
		int m=s.nextInt();
		 int[] ans = allIndices(arr, 0, m, 0);
		 for (int i = 0; i < ans.length; i++) {
		 System.out.println(ans[i]);}


	}
	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			return new int[count];
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}

		if (arr[si] == data) {
			indices[count] = si;
		}

		return indices;
	}

}
