package testthecode5;

import java.util.ArrayList;

public class recursionmazediognal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getmazepath(2,2,0,0));
printmaze(2,2,0,0,"");
	}
	public static ArrayList<String> getmazepath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> mylist = new ArrayList<>();
			mylist.add("");
			return mylist;
		}
		ArrayList<String> mylist = new ArrayList<>();
		ArrayList<String> reclist;
		if (cr < er) {

			reclist = getmazepath(er, ec, cr + 1, cc);

			for (int i = 0; i < reclist.size(); i++) {
				mylist.add('V' + reclist.get(i));
			}
		}
		if (cc < ec) {
			reclist = getmazepath(er, ec, cr, cc + 1);
			for (int j = 0; j < reclist.size(); j++) {

				mylist.add('H' + reclist.get(j));

			}
		}
		if(cc<er&&cc<ec) {
			reclist = getmazepath(er, ec, cr+1, cc + 1);
			for (int j = 0; j < reclist.size(); j++) {

				mylist.add('D' + reclist.get(j));
			
		}}
		return mylist;
	}
public static void printmaze(int er,int ec,int cr,int cc,String res) {
	if (cr == er && cc == ec) {
		System.out.println(res);
		return;
	}
	if (cr < er)
	printmaze(er, ec, cr + 1, cc, res+'V');
	if (cc < ec)
	printmaze(er, ec, cr, cc + 1, res+'H');
	if(cr < er&&cc < ec)
	printmaze(er, ec, cr+1, cc + 1, res+'D');
}
}
