package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsDemo {

	
	public static void main(String[] args) {
		
		List <Integer> items=Arrays.asList(10,20,15,35,25);
		
		
		// Find even numbers
		
		// Square of the numbers
		
		// Add the squares
		
		
		int result = items.stream().filter(item->{
			if(item%2==0) {
				return true;
				}
			return false;
			})
			.mapToInt(item->item*item).sum();
		
		
		System.out.println(result);
		
	}
	
	
}
