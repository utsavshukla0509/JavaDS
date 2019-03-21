import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i == 1) {for(int l=1;l<=2*n-1;l++) {
				System.out.print(n);}
			} else if(i == (2 * n - 1)) {for(int k=1;k<2*n;k++) {
				System.out.print(n);
			}}
			else {System.out.print(n);
				for(int j=1;j<=2*n-3;j++) {
				System.out.print(n-1);
			}
				System.out.print(n);
			}
			System.out.print("\n");
		}	
			
	
		}

	}