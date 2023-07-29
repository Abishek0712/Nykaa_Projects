package JavaBasicPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfWord {
	public static void CountOfWord() {
		String s="Hello Hi";
		String[] split=s.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String x:split) {
			if(map.containsKey(x)) {
				Integer count=map.get(x);
				count++;
				map.put(x, count++);
			}
			else {
				map.put(x, 1);
			}
		}
		System.out.println(map);
	}
	public static void CountOfWord1() {
		String s="Hello there are you";
		String[] split=s.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String x:split) {
			if(map.containsKey(x)) {
			Integer count=map.get(x);
			count++;
			map.put(x, count++);
			}
			else {
				map.put(x, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		CountOfWord();
		CountOfWord1();
	}
}
