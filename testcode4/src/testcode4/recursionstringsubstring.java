package testcode4;

import java.util.ArrayList;

public class recursionstringsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(getss(str));
	}

	public static ArrayList<String> getss(String str) {
		if (str.length()==0) {
			ArrayList<String> baseresult=new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> myresult= new ArrayList<>();
		ArrayList<String> recresult=getss(ros);
		for(int i=0;i<recresult.size();i++)
			{
			myresult.add(recresult.get(i));
			myresult.add(cc+recresult.get(i));
			}
		return myresult;
		
		
		
	}
}
