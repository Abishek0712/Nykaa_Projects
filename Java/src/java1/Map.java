package java1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		//Elements are arranged in ascending order based on the key value
		//Values are added in key and value pair
		//The datatype of the key and the value are given in the Wrapper class
		//Allows duplicate values of diffrent key values
		//Doesn't allow duplicate key values
		HashMap<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("1",11);
		m1.put("1", 11);
		m1.put("5", 10);
		m1.put("4", 14);
		System.out.println(m1);
		
		LinkedHashMap<Integer,Integer> m2=new LinkedHashMap<Integer,Integer>();
		m2.put(1, 101);
		m2.put(2, 102);
		m2.put(2, 102);
		m2.put(3, 101);
		System.out.println(m2);
		
		TreeMap<String,Integer> m3=new TreeMap<String,Integer>();
		m3.put("12",12);
		m3.put("012", 12);
		m3.put("I'll dance dance dance!!",13);
		System.out.println(m3);
	}

}
