package main;

import java.util.Scanner;

public class Krotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	        int d = s.nextInt();
	        int[] array = new int[n];
	        for(int i=0; i<n;i++) {
	            array[(i+n-d)%n] = s.nextInt();
	        }
	        for(int i=0; i<n;i++) {
	            System.out.print(array[i] + " ");
	        }      
		

	}

}
