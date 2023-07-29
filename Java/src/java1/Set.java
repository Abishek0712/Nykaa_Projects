package java1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		//Prints in an ascending order 
		//Does not allow duplicates
		//The datatype to be used is given inside a wrapper class
		//It allows single null value
		HashSet<Integer> a=new HashSet<Integer>();
		a.add(1);
		a.add(1);
		a.add(5);
		a.add(2);
		a.add(null);
		a.add(null);
		a.add(6);
		System.out.println(a);
		
		//Prints in an ascending order 
		//Does not allow duplicates
		//The datatype to be used is given inside a wrapper class
		//It doesn't allow single null value
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(23);
		t.add(33);
		t.add(23);
		a.add(null);
		t.add(21);
		System.out.println(t);
		
		//Prints in insertion order 
		//Does not allow duplicates
		//it allows single null value
		LinkedHashSet<Integer> t1=new LinkedHashSet<Integer>();
		t1.add(23);
		t1.add(23);
		t1.add(21);
		t1.add(25);
		t1.add(24);
		t1.add(null);
		t1.add(null);
		System.out.println(t1);
	}

}
