package collectionbasics;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Object> stack=new Stack<>();
		
		stack.push(10);
		stack.push(25);
		stack.push("Rahul");
		stack.push(30);
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
