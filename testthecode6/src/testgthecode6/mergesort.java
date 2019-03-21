package testgthecode6;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {4,2,5,7,3,1};
int[]ans=mergesort(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++) {
	System.out.print(ans[i]+" ");
}
	}
	public static int[] mergesort(int[] arr, int low, int high) {
		if (low == high) {
			int[] base = new int[1];
			base[0] = arr[low];
			return base;
		}
		int mid = (low + high) / 2;
		int[] one = mergesort(arr, low, mid);
		int[] two = mergesort(arr, mid + 1, high);
		int[] sorted = merge(one, two);
		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			ans[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			ans[k] = two[j];
			j++;
			k++;
		}

		return ans;
	}

}
