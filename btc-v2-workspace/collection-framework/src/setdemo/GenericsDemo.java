package setdemo;

import java.util.HashSet;
import java.util.Set;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Set<String> mySet=new HashSet<>();
		
		mySet.add("Rahul");
		mySet.add("Kumar");
		mySet.add("Harsh");
		
		
		
		for(String item:mySet) {
			System.out.println(item.toUpperCase());
		}
		

	}

}
