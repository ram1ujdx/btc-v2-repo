package collectionbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> items = new ArrayList<>();
		
		items.add(10);
		
		items.add(20);
		items.add(5);

		items.add(15);
		
		Collections.sort(items);
		
//		items.remove(2);
		
	
		
//		System.out.println("Size = "+items.size());

// Approach 1		
		
		for(int item:items) {
			System.out.println(item);
		}
		
//		System.out.println(items.get(2));

	}

}
