package testthecode5;

public class reecursionmazecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countmazepath(2, 2, 0, 0));
	}

	public static int countmazepath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			return 1;
		}
		int c1=0,c2=0;
		if (er > cr) {
			c1=countmazepath(er, ec, cr+1, cc);
			
		}
		if (ec > cc) {
			c2=countmazepath(er, ec , cr, cc+1);
			
		}
return (c1+c2);
	}
}