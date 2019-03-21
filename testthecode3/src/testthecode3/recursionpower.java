package testthecode3;

public class recursionpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(power(2,6));
	}
public static int power(int n,int x) {
	int p=1;
	if(x==0) {return 1;}
	p=n*power(n,x-1);
	return p;
}
}
