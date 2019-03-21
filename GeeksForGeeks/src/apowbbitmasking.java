import java.util.*;

public class apowbbitmasking {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(fastpow(a, b));
	System.out.println(fastestpowbitmask(a,b));
	}
public static int fastestpowbitmask(int a,int b) {
	int res=1;
	while(b>0) {
		int lastbit=(b&1);
		
		if(lastbit!=0) {
			res*=a;
		}
		a*=a;
		b=b>>1;
		System.out.println(b);
	}
	System.out.println("******************");
	return res;
	
}
	public static int fastpow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int smallvalue = fastpow(a, b / 2);
		smallvalue *= smallvalue;
		if (b % 2 == 1) {
			return a * smallvalue;
		}
		return smallvalue;
	}

}
