package testthecode2;

import java.util.Scanner;

public class stringremoveduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 String output = new String();

	        for (int i = 0; i < str.length()-1; i++) {
	            
	                if (str.charAt(i) != str.charAt(i+1)) {
	                    output = output + str.charAt(i);
	                
	            }
	                
	        }
	        output=output+str.charAt(str.length()-1);
	        System.out.print(output);
	}

}
