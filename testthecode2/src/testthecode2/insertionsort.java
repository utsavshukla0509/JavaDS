package testthecode2;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		is(arr);
	}
		public static void is(int[] arr) {
			for (int i = 1; i < arr.length; i++) {
				for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
				}
		}

	

}
