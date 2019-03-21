import java.util.Scanner;

public class printrowwisearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][]arr=new int[n][m];
		 for (int i = 0; i < n; i++)
         {
             for (int j = 0; j < m; j++)
             {
                 arr[i][j] = s.nextInt();
             }
         }
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					
						System.out.print(arr[i][j] + ", ");
					

				}

			}
			
		}
		System.out.print("END");
	}
}
