package setdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> mySet=new TreeSet<>();
		
		mySet.add("Rahul");
		mySet.add("Kumar");
		mySet.add("Harsh");
		mySet.add("Harsh");
		
		
		for(String item:mySet) {
			System.out.println(item.toUpperCase());
		}
		

	}

}
