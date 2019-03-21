import java.util.Scanner;

public class spiralarrayprint {

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
		int top = 0, right = arr[top].length - 1, bottom = arr.length - 1, left = 0;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);
		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					top++;
					dir = 2;
				}
			}

			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					right--;
					dir = 3;
				}
			}

			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					bottom--;
					dir = 4;
				}
			}

			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					left++;
					dir = 1;
				}
			}
		}
		System.out.print("END");
	}

}
