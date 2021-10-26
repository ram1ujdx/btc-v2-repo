package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListWithLambda {

	public static void main(String[] args) {
		
		
		List <Integer> items=Arrays.asList(10,20,15,35,25);
		
		
	//	items.forEach((item)->System.out.println(item));
				
		items.forEach(System.out::println);

	}

}
