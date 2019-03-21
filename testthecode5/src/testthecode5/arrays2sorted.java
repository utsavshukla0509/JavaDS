package testthecode5;

import java.util.ArrayList;

public class arrays2sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr1= {1,3,5,7};
int []arr2= {2,4,6};
ArrayList<Integer>arr3=new ArrayList<>();
for(int i=0;i<arr1.length;i++) {
	arr3.add(arr1[i]);
}
for(int j=0;j<arr2.length;j++)
{
	arr3.add(arr2[j]);
	for(int k=0;k<arr3.size()-1;k++)
	{
		if(arr3.get(k)>arr3.get(k+1))
		{
			int temp=arr3.get(k);
			arr3.get(k)=arr3.get(k+1);
			arr3.get(k+1)=temp;
		}
	}
}
	
	}

}
