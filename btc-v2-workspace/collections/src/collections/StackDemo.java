package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(15);
		stack.push(30);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" | Size = "+stack.size());
		}
		
		
		
	}

}
