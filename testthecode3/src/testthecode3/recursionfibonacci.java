package testthecode3;

public class recursionfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fib(6));
	}
public static int fib(int n) {
	int f=0;
	if (n==0) {return 0;}
	else if(n==1) {return 1;}
	else {
	f=fib(n-1)+fib(n-2);
	return f;
	}
}
}
