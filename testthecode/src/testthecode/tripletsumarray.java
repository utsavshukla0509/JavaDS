package testthecode;

import java.util.Scanner;

public class tripletsumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}
int m=s.nextInt();

for(int i=0;i<arr1.length-1;i++) {
	for(int j=i+1;j<arr1.length;j++)
	{if(arr1[i]>arr1[j]) {
		int temp=arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
	}
	
		
	}
}



for (int i = 0; i < arr1.length- 2; i++) {
	for (int j = i + 1; j < arr1.length - 1; j++) {

        
        for (int k = j + 1; k < arr1.length; k++) {
            if (arr1[i] + arr1[j] + arr1[k] == m) {
                System.out.println( arr1[i] + 
                             ", " + arr1[j] +" "+ "and " + arr1[k]);
                
            }
        }
    }
}
	}

}
