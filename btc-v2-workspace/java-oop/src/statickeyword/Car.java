package statickeyword;

public class Car {

	int regno;
	String color;
	static int noOfWheels;
	
	
	public Car() {
	}


	public Car(int regno, String color) {
		super();
		this.regno = regno;
		this.color = color;
		
	}
	
	
	public void showCarDetails() {
		System.out.println("Color - "+this.color);
		System.out.println("Reg No. - "+this.regno);
		System.out.println("No of Wheels - "+noOfWheels);
	}
	
	public static void staticMethod() {
		System.out.println("Hello...");
	}
	
	
}
