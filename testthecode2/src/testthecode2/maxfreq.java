package testthecode2;

import java.util.Arrays;
import java.util.Scanner;

public class maxfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		char arr[]=str.toCharArray();
		 
        Arrays.sort(arr);
         
       
        int max = 1;
        int curr = 1;
        char res = arr[0];
         
        for (int i = 1; i <arr.length; i++)
        {
            if (arr[i] == arr[i - 1])
                curr++;
            else
            {
                if (curr > max)
                {
                    max = curr;
                    res = arr[i - 1];
                  
                }
                curr = 1;
            }
        }
     
        if (curr > max)
        {
            max = curr;
            res = arr[arr.length - 1];
        }
       
        System.out.println(res);
      
	}

	}


