package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> queue=new ArrayDeque<>();
		
		queue.add("Mahesh");
		queue.add("Anil");
		queue.add("Suhash");
		queue.add("Gaurav");
		queue.add("Rahul");
		queue.addLast("Umesh");
		queue.addFirst("Tushar");
		
		while(!queue.isEmpty()) {
		System.out.println(queue.remove());
		}
		
		

	}

}
