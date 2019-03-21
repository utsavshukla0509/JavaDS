import java.util.Scanner;

public class subsequencesofagivenstringbyBITMASKING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] arr = new char[10];
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			arr[i] = s.next().charAt(0);
		}

		generatesubsets(arr,a);
	}

	public static void filterchars(char a[], int no) {

		int i = 0;
		while (no > 0) {
			char b = (no & 1) != 0 ? a[i] : " ".charAt(0);
			System.out.print(b);
			i++;
			no = no >> 1;
		}
		System.out.println();
	}

	public static void generatesubsets(char a[],int n) {
		
		int range = (1 << n) - 1;
		for (int i = 0; i <= range; i++) {
			filterchars(a, i);
		}
	}
}
