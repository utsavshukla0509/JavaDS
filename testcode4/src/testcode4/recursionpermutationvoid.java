package testcode4;

public class recursionpermutationvoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
per("abc","");
	}
public static void per(String str,String res) {
	System.out.println(res+str);
	char cc=str.charAt(0);
	String sr=str.substring(1);
	per(sr,cc+res);
}
}
