package lecture1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c=0,i=1;
        if(i<n) {
                 while(c<n)
                 { c=a+b;
                 if(a!=0) {System.out.println(c);}
                   a=b;
                   b=c;
                  
                 }
        
                }
        if(n==1){System.out.print(0+"\n"+1+"\n"+1);}

	}

}
