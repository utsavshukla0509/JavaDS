import java.util.Scanner;

public class countmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int end = s.nextInt();
		int[] arr = new int[end + 1];
		System.out.println(CBPDP(end, 0, arr));
		System.out.println(CBPI(end,0));
	}

	public static int CBPDP(int end, int curr, int[] strg) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count = count + CBPDP(end, curr + i, strg);

		}
		strg[curr] = count;
		return count;
	}
	public static int CBPI(int end,int curr) {
		int []strg=new int[end+1];
		strg[end]=1;
		for(int i=end-1;i>=0;i--) {
			int count=0;
			for(int dice=1;dice<=6&&dice+i<strg.length;dice++) {
				count =count+strg[dice+i];
			}
			strg[i]=count;
		}
return strg[curr];
	}

}
