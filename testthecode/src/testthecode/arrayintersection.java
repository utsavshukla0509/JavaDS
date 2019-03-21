package testthecode;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr1[] = new int[n];
for (int i = 0; i < arr1.length; i++) {
	arr1[i] = s.nextInt();
}
int arr2[] = new int[n];
for (int i = 0; i < arr2.length; i++) {
	arr2[i] = s.nextInt();
}

for(int i=0;i<arr1.length;i++)
{   for(int j=i+1;j<arr1.length;j++) {
	if(arr1[i]>arr1[j])
	{int temp=arr1[i];
	 arr1[i]=arr1[j];
	 arr1[j]=temp;}
	}
}



for(int i=0;i<arr2.length;i++)
{   for(int j=i+1;j<arr2.length;j++) {
	if(arr2[i]>arr2[j])
	{int temp=arr2[i];
	 arr2[i]=arr2[j];
	 arr2[j]=temp;}
	}
}

ArrayList<Integer>list=new ArrayList<>();
int i = 0, j = 0;
while (i < arr1.length && j < arr2.length)
{
  if (arr1[i] < arr2[j])
    i++;
  else if (arr2[j] < arr1[i])
    j++;
  else
  {
    list.add(arr1[i]);
    i++;j++;
  }
}
System.out.print(list);


	}

}
