
import java.util.*;
import java.util.regex.*;

public class codechef {

	private static Scanner in;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Boolean b=Pattern.matches("...","aam");
		System.out.println(b);
		System.out.println(Pattern.matches("[aaaccdd]", "cc"));
		System.out.println(Pattern.matches("[^acd]","a"));
		System.out.println(Pattern.matches("[a-zA-Z]","z"));
		System.out.println(Pattern.matches("[MS][a-z]{5}","Sonica"));
		System.out.println(Pattern.matches("[xyz]?","a"));
		System.out.println(Pattern.matches("[xyz]*","xxxxxx"));
		System.out.println(Pattern.matches("[xyz]+","xxxxxxxxx"));
		System.out.println(Pattern.matches("\\d*","23"));
		System.out.println(Pattern.matches("\\D","a"));
		System.out.println("***************************");
		Pattern p=Pattern.compile("java");
		Matcher m=p.matcher("thisisjava");
		
		System.out.println(m.find()+" Starting Index "+m.start()+" End at "+m.end());
		
		
		
		
		
	}
}