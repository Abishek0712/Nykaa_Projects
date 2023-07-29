package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOfRepeated {
	public static void repetiativechar() {
	String s="WelcomeGod";
	char[] ch=s.toCharArray();
	Map<Character,Integer> m1=new HashMap<Character,Integer>();
	for(char c:ch) {
		if(m1.containsKey(ch)) 
		{
			Integer i1=m1.get(c);
			if(m1.containsKey(i1)) 
			{
				Integer it=m1.get(i1);
				m1.put(c,i1+1);
			}
			else 
			{
				m1.put(c, i1);
			}
		}
	}
}
}
