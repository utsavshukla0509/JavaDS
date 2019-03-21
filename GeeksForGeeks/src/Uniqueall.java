import java.util.Scanner;

public class Uniqueall {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		// find1(arr,n);
		// find2(arr,n);
		System.out.println(find3(arr, n));
	}

	// find 1 no. in two duplicates
	public static void find1(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			count = count ^ a[i];
		}
		System.out.println(count);
	}

	// find 2 no.s in two duplicates
	public static void find2(int[] a, int n) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = res ^ a[i];
		}
		int i = 0;
		int temp = res;
		while (temp > 0) {
			if ((temp & 1) != 0) {
				break;
			}
			i++;
			temp = temp >> 1;
		}
		int mask = 1 << i;
		int f = 0;
		for (int j = 0; j < n; j++) {
			if ((mask & a[j]) != 0) {
				f = f ^ a[j];
			}
		}
		int s = res ^ f;
		System.out.print(s + " " + f);
	}

	// find 1 no. in 3 duplicates
	public static int find3(int a[], int n) {
		int[] cnt = new int[10];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = 0;
		}
		for (int j = 0; j < n; j++) {
			int i = 0;
			int no = a[j];
			while (no > 0) {
				cnt[i] += (no & 1);
				i++;
				no = no >> 1;

			}
		}
		int p=1;
		int ans=0;
   for(int k=0;k<cnt.length;k++) {
	   
	cnt[k]%=3;
	ans+=cnt[k]*p;
	p=p<<1;
}
   return ans;
	}
}
