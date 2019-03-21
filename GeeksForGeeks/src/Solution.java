import java.util.*;

public class Solution {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
	decToBinary(9);
	System.out.println(Integer.toBinaryString(5));
	
	
	
	
	}
	public static void decToBinary(int n) 
	{ 
	    for (int i = 31; i >= 0; i--) { 
	        int k = n >> i; 
	        if ((k & 1)!=0) {
	            System.out.print("1"); }
	        else
	            System.out.print("0"); 
	    }
	    System.out.println();
	} 
}
