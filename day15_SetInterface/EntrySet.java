package day15_SetInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(23,"A");
	map.put(30,"B");
	map.put(40,"C");
	map.put(50,"D");
	
	for(Entry<Integer, String> entry : map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
