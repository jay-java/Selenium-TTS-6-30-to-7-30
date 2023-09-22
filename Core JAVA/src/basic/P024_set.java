
package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P024_set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("java");
		set.add('d');
		set.add(false);
		set.add(235324532);
		set.add(1);
		set.add(34.3);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
