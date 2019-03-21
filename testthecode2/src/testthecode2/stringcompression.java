package testthecode2;

import java.util.Scanner;

public class stringcompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		int count=1;
		 if(str.length()==1) {sb.append(str.charAt(0));}
		for(int i = 1; i<str.length(); i++){

            if(str.charAt(i) == str.charAt(i-1) && i < str.length()-1){
                count++;
            }
          
            else if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)){
                count++;
                sb.append(str.charAt(i));
               sb.append(count);
            }

          
            else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i-1));
                if(count!=1) {sb.append(count);}
                count = 1;
                sb.append(str.charAt(i));
            }
            else{
               
                sb.append(str.charAt(i-1));
                if(count!=1) {sb.append(count);}
                count = 1;
            }

        }
		System.out.println(sb.toString());

	}

}
