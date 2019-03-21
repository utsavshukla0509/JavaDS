import java.lang.*;
public class KedaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-1,-1,-1,-1};
		System.out.println(maxsubarraysum(arr, arr.length));
		System.out.println(maxsubarraysumDP(arr, arr.length));
	}

	// maxsubarraysum is the ordinary approach.
	public static int maxsubarraysum(int a[], int size) {
		int max_so_far = 0, max_ending_here = 0;
		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here < 0) {
				max_ending_here = 0;
			} else if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}

	// but by Dynamic Programming
	public static int maxsubarraysumDP(int a[], int size) {
		int max_so_far = a[0], curr_max = a[0];
		for (int i = 0; i < size; i++) {
			curr_max=Math.max(a[i],curr_max+a[i]);
			max_so_far=Math.max(max_so_far,curr_max);
		}
		return max_so_far;
	}
}
