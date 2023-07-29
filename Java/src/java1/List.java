package java1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		
		//Prints in the insertion order 
		//allows duplicate elements
		//Datatype that we want to add is defined in the Wrapper classes
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(13);
		a.add(12);
		a.add(11);
		System.out.println("ArrayList :"+a);
		
		//Prints in the insertion order 
		//allows duplicate elements
		//Datatype that we want to add is defined in the Wrapper classes
	
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(23);
		a1.add(23);
		a1.add(34);
		a1.add(21);
		System.out.println("LinkedList :"+a1);
	
		//Prints in the insertion order 
		//allows duplicate elements
		//Datatype that we want to add is defined in the Wrapper classes
	
		Vector<Integer> a2=new Vector<Integer>();
		a2.add(12);
		a2.add(12);
		a2.add(31);
		a2.add(11);
		System.out.println("VectorList"+a2);
	}

}
