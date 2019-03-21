import java.util.Scanner;

public class anytoanyconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int sb=s.nextInt();
int db=s.nextInt();
int sn=s.nextInt();
System.out.print(atoa(sb,db,sn));
	}
public static int atoa(int sb,int db,int sn)
{
	int dec = atod(sn,sb);
	int l = dtoa(dec, db);
	return l;
}


public static int atod(int sn, int sb) {

	int dec = 0;
	int sbp = 1;
	int rem = 0;

	while (sn != 0) {
		rem =sn % 10;
		dec = dec + rem * sbp;
		sbp = sbp * sb;
		sn = sn / 10;
	}

	return dec;
}
public static int dtoa(int dec, int db) {
	int num = 0;
	int tp = 1;
	int rem = 0;
	while (dec != 0) {
		rem = dec % db;
		num = num + rem * tp;
		tp = tp * 10;
		dec = dec / db;
	}

	return num;
}

}
