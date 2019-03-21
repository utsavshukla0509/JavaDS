package testthecode;

public class inversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1432;
int i=1;
int inv=0;
int rem=0;
while(n!=0) {
	rem=n%10;
	int c=(int)(Math.pow(10,rem-1));
	inv=inv+i*c;
    n=n/10;
	i++;
}
System.out.print(inv);
	}

}
