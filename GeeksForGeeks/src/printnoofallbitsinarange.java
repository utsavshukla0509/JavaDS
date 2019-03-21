import java.util.*;

public class printnoofallbitsinarange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int R = scan.nextInt();
//		scan.close();
//
//		int xored = L ^ R;
//		int a = Integer.numberOfLeadingZeros(xored);
//		int significantBit = 31 - a;
//		int result = (1 << (significantBit + 1)) - 1;
//
//		System.out.println(result);
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=L;i<=R;i++) {
			for(int j=L;j<=R;j++) {
				list.add(i^j);
			}
		}
		System.out.println(Collections.max(list));
		
		math.po

	}

	public static void findallbits(int a, int b) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			count += countbits(i);
		}
		System.out.println(count);
	}

	public static int countbits(int n) {
		int count = 0;
		while (n > 0) {
			count += (n & 1);
			n = n >> 1;
		}
		return count;
	}

}
