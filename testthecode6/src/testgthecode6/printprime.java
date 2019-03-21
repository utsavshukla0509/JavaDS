package testgthecode6;

public class printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soe(50);

	}

	public static void soe(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int k = 2; k*k<= n; k++) {
			if(primes[k]) {
				for (int j = 2*k; j < primes.length; j+=k) {
					if (j % k == 0) {
						primes[j] = false;
					}
				}
			}
			
		}
		for(int i=2;i<primes.length;i++) {
			if(primes[i]==true) {
				System.out.println(i);
			}
		}
	}
}
