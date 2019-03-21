package testthecode;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 40, 10, 20, 50, 80 };
		int[] bs = { 10, 20, 30, 40, 50 };
		System.out.println(ls(arr, 10));
		System.out.println(bins(bs, 20));
		int[]rotate= {3,8,7,6,5};
		int []ans=rotate(rotate,3);
		System.out.print(ans);
	}
	public static int [] rotate(int[]arr,int k) {
		
		
		
		
	}

	public static int ls(int[] arr, int n) {
		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				ans = i;
			}

		}
		return ans;

	}

	public static int bins(int[] arr, int data) {
		for(int i=0;i<arr.length;i++)
		{for(int j=i+1;j<arr.length;j++)
		{  if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
			
		}
		int flag = -1;
		int fst = 0;
		int lst = arr.length - 1;
		int mid = (fst + lst) / 2;
		while (fst <= lst) {
			mid = (fst + lst) / 2;
			if (arr[mid] == data) {
				flag = mid;
				//fst=lst+1;(optional)
				
				break;
			} else if (arr[mid] > data) {
				lst = mid - 1;

				
			} else {
				fst = mid+1;
				

			}

		}

		return flag;
	}
}
