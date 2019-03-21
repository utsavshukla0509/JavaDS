import java.util.Scanner;

public class superpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int b=0;
int pb=1;
while(b!=m) {pb=pb*n; 	
	         b++;
            }

System.out.print(pb);
	}

}
