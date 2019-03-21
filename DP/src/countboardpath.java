import java.util.Scanner;

public class countboardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
int [][]strg=new int[n+1][n+1];
	System.out.println(CMP(0,0,n,n,strg));
	
	
	}
public static int CMP(int cr,int cc,int er,int ec,int[][]strg) {
	if(cr==ec&&cc==er) {
		return 1;
	}
	if(cr>er||cc>ec) {
		return 0;
	}
	if(strg[cr][cc]!=0) {
		return strg[cr][cc];
	} 
	int count=0;
	count=count+CMP(cr+1,cc,er,ec,strg);
	
	count=count+CMP(cr,cc+1,er,ec,strg);
	strg[cr][cc]=count;
return count;
}
public static int CMPI(int cr,int cc,int er,int ec) {
	int arr[][]=new int[er+1][er+1];
	arr[er][ec]=1;
	for(int i=er;i>cr;i--) {
		int count=0;
		for(int j=ec;j>cc;j--) {
			if(cr==ec||cc==ec) {
				arr[i][j]=1;
			}
			else {
			count=count+arr[i][j];
		}}
	arr[er][ec]=count;
	}
	return arr[cr][cc];
}
}
