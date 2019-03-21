package testthecode3;

public class recursionfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(fact(6));
	}
public static int fact(int n) {
	int f=1;
	if(n!=0) { 
	f=n*fact(n-1);}
	return f;
}
}
