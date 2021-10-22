package collectionbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List items = new ArrayList();
		
		items.add(10);
		
		items.add("Hello");
		items.add(true);

		items.add(1,28.39);
		
//		items.remove(2);
		
		items.remove("Hello");
		items.remove((Object)10);
		
		System.out.println("Size = "+items.size());

// Approach 1		
		
		for(Object item:items) {
			System.out.println(item);
		}
		
//		System.out.println(items.get(2));

	}

}
