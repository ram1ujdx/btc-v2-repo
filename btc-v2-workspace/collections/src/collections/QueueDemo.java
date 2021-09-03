package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(10);
		queue.add(200);
		queue.add(30);
		
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()+" | Size = "+queue.size());
		}
		
		

	}

}
