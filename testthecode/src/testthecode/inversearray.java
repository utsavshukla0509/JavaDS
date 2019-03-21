package testthecode;

import java.util.Scanner;

public class inversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int c;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		c = inv(arr, n);
		if (c == 0) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}

	public static int inv(int[] arr, int n) {
		int arr1[] = new int[n];
		int i = 0;
		int a = 0;

		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = j + 1; k < arr.length - 1; k++) {
				if (arr[j] == arr[k]) {
					a++;
					break;
				}

				else {
					for (i = 0; i < arr.length; i++) {
						if (arr[i] < n && arr[i] >= 0) {

							arr1[arr[i]] = i;
						}
					}
					break;
				}
			}
		}
		for(int l=0;l<arr.length;l++) {
			if(arr1[l]!=arr[l]){a++;}
			
			}
		return a;
	}
}
