package testthecode9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
	
	
	public static void main(String[] args) {
	String str="abaadaacb";
	System.out.println(getmaxfrq(str));
	}
	public static char getmaxfrq(String str) {
HashMap<Character,Integer> map=new HashMap<>();
int a=1;
for(int i=0;i<str.length();i++) {
	
	
	if(map.containsKey(str.charAt(i))) {
		a++;
		map.put(str.charAt(i),a);
	}
	else {
		a=1;
		map.put(str.charAt(i),a);
	}
}
int max=0;
char c='a';
Set<Map.Entry<Character,Integer>>entries=map.entrySet();
for(Map.Entry<Character,Integer>entry:entries) {
	if(entry.getValue()>max) {
		max=entry.getKey();
		c=entry.getKey();
	}
}

return c;
	}

}

