package testgthecode6;
import java.util.ArrayList;
import java.util.Scanner;

public class recursioncodesofthesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		convert(str,"");
		System.out.println(list.toString());
	}
	public static ArrayList<String>list=new ArrayList<>();
	public static void convert(String str,String res){
	if(str.length()==0) {
		
		
		list.add(res);
		
		return;
	}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		convert(ros,res+(char)((int)cc-'0'+96));
		
		if(str.length()>=2) {
	         String pp=str.substring(0,2);
	         int m=Integer.parseInt(pp);
	        if(m>0&&m<27) {
	         ros=str.substring(2);
			convert(ros,res+(char)(Integer.parseInt(pp)+96));
		}else {return;}
		}
		else{return;}
	
	
	}
}