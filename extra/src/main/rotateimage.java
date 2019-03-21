package main;

import java.util.Scanner;

public class rotateimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
              arr[i][j]=s.nextInt();
			}
		}
		
		
		
		for(int m=n-1;m>=0;m--) {
			for(int p=0;p<n;p++) {
				System.out.print(arr[p][m]+" ");
			}
			System.out.println();
		}
	}

}
