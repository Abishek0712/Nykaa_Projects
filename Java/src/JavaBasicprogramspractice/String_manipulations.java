package JavaBasicprogramspractice;

import java.util.Arrays;
import java.util.TreeSet;

public class String_manipulations {
	static String s="Welcome to 12345Java@.!";
	
	public static void countofletters() {
		int smallletters=0;
		int capletters=0;
		int numbers=0;
		int symbols=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				smallletters++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				capletters++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				numbers++;
			}
			else if(s.charAt(i)!=' '){
				symbols++;
			}
		}
		System.out.println("Small_Letters count of the entered string:"+smallletters);
		System.out.println("Capital letters count of the entered string:"+capletters);
		System.out.println("Numbers count inside the entered string are:"+numbers);
		System.out.println("Symbols count inside the entered string are:"+symbols);
	}
	public static void replace() {
		String replaCE=s.replace(" ", "ManojManoj");
		System.out.println("Replaced string is:"+replaCE);
	}
	public static void removedupinarray() {
	String[] s= {"Dropit","Dropit","SHermone","SHermone"};	
	java.util.List<String> s2=Arrays.asList(s);
	TreeSet<String> t1=new TreeSet<String>(s2);
	System.out.println("The array with the duplicates removed:"+t1);
	}
	public static void main(String[] args) {
		countofletters();
		replace();
		removedupinarray();
	}
}
