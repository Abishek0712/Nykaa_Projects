package java1;
import java.util.TreeMap;
import java.util.Stack;
public class TM {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
	map.put(12,"Eni");
	map.put(13, "mini");

	map.put(14, "mine-e");
	map.put(15, "you");
	System.out.println(map);
	
	Stack<String> stack=new Stack<>();
	stack.push("America");
	stack.push("Malaysia");
	stack.push("Malaysia");
	
	System.out.println("Stack elements are"+stack);
}
}
