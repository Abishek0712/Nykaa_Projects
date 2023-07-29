package JavaBasicPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repetative_letters {
	public static void main(String[] args) {
		String s="Good Morning Good Afternoon Good Night";
		String[] sp=s.split("");
		
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<sp.length;i++) {

			if(m.containsKey(sp[i])) {
				Integer n = m.get(sp[i]);
				m.put(sp[i], n+1);
				m.equals(sp);
				
			}
			else {
				m.put(sp[i], 1);
				m.containsKey(sp);
			}
		}
		System.out.println(m);
	}
	}