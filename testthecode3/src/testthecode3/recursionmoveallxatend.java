package testthecode3;

import java.util.ArrayList;
import java.util.Scanner;

public class recursionmoveallxatend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		ArrayList<Character>track=new ArrayList<>();
System.out.print(end(str,"",0,track));
	}
	public static String end(String str,String res,int index,ArrayList<Character> track)
	{
	  if(index==str.length() && track.size()==0)
	  {
	    return res;
	  }
	  else if(index==str.length() && track.size()!=0)
	  {

	    return end(str,res+String.valueOf(track.remove(0)),index,track);
	  }
	  else if(str.charAt(index)=='x')
	  {
	    track.add(str.charAt(index));
	    return end(str,res,index+1,track); 
	  }
	  else
	  {
	    return end(str,res+str.charAt(index),index+1,track);
	  }

	}
}
