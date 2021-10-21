package exceptionbasics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileReader reader=new FileReader("myfile1.txt");
		
		Scanner scan=new Scanner(reader);
		
		
		System.out.println(scan.nextLine());
		
		
		
		
		
	}
	
}
