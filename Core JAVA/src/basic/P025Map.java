package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P025Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");//entry
		map.put("C++", 2);
		map.put('j', 2);
		map.put(4, "java");
		map.put(5, "python");
		map.put(6, "dart");
		map.put(null, "kotlin");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
