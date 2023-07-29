package java1;
import java.util.HashMap;
public class HM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("a", 12);
		map.put("b", 23);
		map.put("c", 34);
		if(map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value for key a is"+a);
		}
	}

}
