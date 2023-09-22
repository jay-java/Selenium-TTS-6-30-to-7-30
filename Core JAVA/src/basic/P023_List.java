package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P023_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add('a');
		list.add("java");
		list.add(125435);
		list.add(false);
		list.add(3453.3);
		list.add(1);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
		
		List list1 = new ArrayList();
		list1.add(12);
		list1.add(list);
		System.out.println(list1);
	}
}
